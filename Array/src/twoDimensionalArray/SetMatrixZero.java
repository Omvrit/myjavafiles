
package twoDimensionalArray;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {

    public static void main(String[] args) {
       Scanner scan =  new Scanner(System.in);
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int matrix[][] = new int [rows][columns];
        int i = 0;
        int j = 0;
        for(i=0;i<rows;i++){
            for(j=0;j<columns;j++){
                matrix[i][j] = scan.nextInt();
            }
        }

        boolean iffrowzero = false;
        boolean iffcolumnzero = false;
        for(i =0;i<rows;i++){
            if(matrix[i][0]==0){
                iffcolumnzero = true;
                break;
            }
        }
        for(j =0;j<columns;j++){
            if(matrix[0][j]==0){
                iffrowzero = true;
                break;
            }
        }
        for (i = 1; i < rows; i++) {
            for (j = 1; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(i =1;i<rows;i++){
            j=0;
            if(matrix[i][0] == 0){
               while(j<columns){
                   matrix[i][j]=0;
                   j++;
               }
            }
        }
        //setting columns to zeros
        for(j =1;j<columns;j++){
            i=1;
            if(matrix[0][j]==0){
                while(i<rows){

                    matrix[i][j]=0;
                    i++;
                }
            }
        }
        if(iffrowzero){
            j =0 ;
            while(j<columns){
                matrix[0][j]=0;
                j++;
            }}
        if(iffcolumnzero){
            i =0;
            while(i<rows){

                matrix[i][0]=0;
                i++;
            }
        }



            for (i = 0; i < rows; i++) {
                for (j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }


        }
    }
