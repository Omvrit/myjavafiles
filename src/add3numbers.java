import java.util.Scanner;

public class add3numbers {
    public static void main(String[]arg) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long b=a;
        long rem;
        long count=0;
        while(a!=0){
            rem= a%10;

            a/=10;
            count+=rem;
        }
        System.out.printf("sum of the digits is %d",count);

    }


    }


