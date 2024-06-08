import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int m = Scan.nextInt();
        for(int i = 1; i<= m ; i++){
            for( int  j =i;j<=m/2 && i<=m/2+1;j++){
                System.out.print(" "+" ");
            }
            for(int j =1;j<=2*i-1 && i<=m/2+1;j++){
                System.out.print("*"+" ");
            }
            for ( int k = 1;k<=i-(m/2)-1 && i>m/2+1;k++){
                System.out.print(" "+" ");
            }
            for(int k = 1;k<=2*(m-i)+1 &&  i>m/2+1;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
