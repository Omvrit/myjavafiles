import java.util.Scanner;

public class numberFlippedCoin {
    public static void main(String[] args) {
        int m, n;
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        int a;


//        for (int i = m; i >= 1; i--) {
//            a = 1;
//            for (int j = 1; j <= m; j++) {
//                if (j > i - 1) {
//                    System.out.print(a + " ");
//                    a++;
//                } else {
//                    System.out.print(" " + " ");
//
//                }
//
//
//
//            }
//            System.out.println();
//        }
        for (int i = 1; i <=m; i++) {
            a = 1;
            for (int j = 1; j<=m-i ; j++) {
                System.out.print(" "+"  ");
            }
            for(int j =1;j<=i;j++){
                System.out.print(i+"  ");
            }

            System.out.println();
        }
    }
}