package twoDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintArrayInSpiralForm {
    public static void main(String[] args) {
        //in this question used segments of arrays firstly the outer layer and then second layer and so on
        int[][] arr = {{2},{3},{4}};
        int times = (int) Math.ceil(Math.min(arr.length,arr[0].length) / 2.0);
        int rows = arr.length;

        int column = arr[0].length;


        ArrayList<Integer> arr2 = new ArrayList<>(rows*column);
        int a = 0;
        int n = 0;
        while (n < times) {

            int i = n;
            int j = n;
            //printing first row
            while (j < column - n) {
                arr2.add(a, arr[i][j]);
                a++;
                j++;
            }
            j = j - 1;
            i = i + 1;
            if(i>=rows-n){
                break;
            }
            //last column

            while (i < rows - n) {
                arr2.add(a, arr[i][j]);
                a++;
                i++;
            }
            i = i - 1;
            j = j - 1;

            if(j<n){
                break;
            }
            //this if statement is used to prevent index getting out of scope



            //last row
            while (j > n - 1) {
                arr2.add(a, arr[i][j]);
                a++;
                j--;
            }
            j = j + 1;
            i = i - 1;
            //first column
            while (i > n) {
                arr2.add(a, arr[i][j]);
                a++;
                i--;
            }


            n++;
        }
        for(int i = 0;i<a;i++){
            System.out.print(arr2.get(i)+" ");
        }

    }
}
