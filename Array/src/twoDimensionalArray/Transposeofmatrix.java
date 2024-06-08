package twoDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Transposeofmatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,},{4,5,6},{7,8,9}};
        int [][]arr2 = new int [3][3];
        int m = 3;
//        using another array
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                arr2[j][i] = arr[i][j];
//            }
//
//        }
        // using same arr
        int temp;
        for (int i = 0; i < m; i++) {
            for (int j = i+1; j < m ; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }
        for(int i = 0 ; i<m;i++){
            for(int j =0;j<m/2;j++){
                temp = matrix[i][j];
                matrix[i][j]=  matrix[i][m-1-j];
                matrix[i][m-1-j] = temp;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }

    }
}
