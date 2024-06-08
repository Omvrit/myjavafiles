public class PrintArray {
    static void print(int [][]arr){
        int rows= arr.length;
        int column = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
    }
}
