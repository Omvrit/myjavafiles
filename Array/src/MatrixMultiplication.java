import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int n,m,p,q;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter row and column respectively for 1st");
        m = scan.nextInt();
        n = scan.nextInt();
        System.out.println("enter row and column respectively for 2nd");
        p = scan.nextInt();
        q = scan.nextInt();
        if(n!=p){
            System.out.println("Not possible to multiply");
        }
        else {
            int[][] arr1 = new int[m][n];
            int[][] arr2 = new int[p][q];
            int[][] arr3 = new int[m][q];
            System.out.println("enter values for arr 1");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr1[i][j] = scan.nextInt();
                    }
            }
            System.out.println("enter values for arr 2");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    arr2[i][j] = scan.nextInt();
                }
            }

            for(int i =0;i< m;i++){
                for(int j =0;j<q;j++){
                    for(int k =0;k<n;k++){
                        arr3[i][j] = arr3[i][j] + arr1[i][k]*arr2[k][j];
                    }
                }
            }
            System.out.println("Result");
            for (int i = 0; i < m; i++) {
                System.out.print("|");
                for (int j = 0; j < q; j++) {
                    System.out.print(arr3[i][j]+" ");
                }
                System.out.println("|");
            }

        }
    }
}



