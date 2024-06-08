import java.util.Scanner;

public class numberPyramidPalindrome {

    public static void main(String[] args) {


        int m, n;
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        int a;
        for (int i = 1; i <= m; i++) {
            a = 1;
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for(int j =i-1;j>=1;j--){
                System.out.print(j + " ");

            }


            System.out.println();
        }
    }}