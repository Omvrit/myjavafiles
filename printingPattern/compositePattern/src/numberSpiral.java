import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class numberSpiral {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int n = Scan.nextInt();
        int m = 2 * n - 1;
        int hm = m / 2;//for h=7 hm=3

        for (int i = 1; i <= m; i++) {
//           for(int j=1;j<=m;j++){
////               if(i==7 || i==1 || j==1 || j==7){
////                   System.out.print("4"+" ");
////               }
////               else if(i==2||i==6||j==2||j==6){
////                   System.out.print("3"+" ");
////               }
////               else if(i==3||i==5||j==3||j==5){
////                   System.out.print("2"+" ");
////               }
////               else{
////                   System.out.print("1"+" ");
////               }
//

//            if (i < hm + 1) {
//                int hm1 = hm + 1;   //hm1=3+1 =4
//                int Hm1 = hm1;
//                for (int j = hm1; j > hm + 1 - i; j--) {
//                    System.out.print(j + " ");
//                }
//                for (int j = 1; j <= m - 2 * i; j++) {
//                    System.out.print((hm1 + 1 - i) + " ");
//                }
//                for (int j = hm1 + 1 - i; j <= hm1; j++) {
//                    System.out.print(j + " ");
//                }
//            }
//            if (i == hm + 1) {
//                int hm1 = hm + 1;
//                for (int j = hm1; j >= 1; j--) {
//                    System.out.print(j + " ");
//                }
//                for (int j = 2; j <= hm1; j++) {
//                    System.out.print(j + " ");
//                }
//            }
//            if (i > hm + 1) {
//                int hm1 = hm + 1;   //hm1=3+1 =4
//                int Hm1 = hm1;
//                for (int j = 1; j <= m - i + 1; j++) {
//                    System.out.print(hm1-- + " ");
//
//                }
//                for (int j = 1; j < 2 * (i % (hm + 1)); j++) {
//                    System.out.print(i % (hm + 1) + 1 + " ");
//                }
//                for (int j = i % (hm + 1) + 1; j <= m % (hm + 1) + 1; j++) {
//                    System.out.print(j + " ");
//                }
//
//            }
//            System.out.println();
//        }
            if (i <= n) {
                for (int j = 1; j <= m; j++) {
                    if (j <= 4) {
                        System.out.print(n+1-min(i, j) + " ");
                    } else {


                        System.out.print(n+1-min(i, 2 * n - j) + " ");
                    }

                }
            } else {
                for (int j = 1; j <= m; j++) {
                    if (j <= n) {


                        System.out.print(n+1-min(2 * n - i, j) + " ");
                    } else {
                        System.out.print(n+1-min(2 * n - i, 2 * n - j) + " ");

                    }
                }
            }
            System.out.println();
        }
    }
}
