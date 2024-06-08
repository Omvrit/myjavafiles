import java.util.Scanner;
public class leetcode69sqrt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        long  hi=x;

        long answer = 1;
        long lo  = 0 ;
        while(lo<=hi){
            long mid = lo-(lo-hi)/2;
            if(mid*mid>x){
                hi = mid -1;
            }
            else if(mid*mid<x ){
                if((mid+1)*(mid+1)>x){
                    answer = mid;
                    break;
                }
                else lo = mid+1;


            }
            else {answer = mid;
            break;}

        }
        System.out.println(answer);

    }
}
