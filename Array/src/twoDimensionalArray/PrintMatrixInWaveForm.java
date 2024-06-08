package twoDimensionalArray;


public class PrintMatrixInWaveForm {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,},{4,5,6},{7,8,9}};
        int [][]arr2 = new int [3][3];
        int m = 3;
        //method1
        for(int i = m-1; i>=0 ; i--){

            if(i%2==0){
                for(int j = 0;j<m;j++){
                    System.out.print(matrix[j][i]+" ");
                }
            }
            else{
                for(int j = m-1;j>-1;j--){
                    System.out.print(matrix[j][i]+" ");
                }
            }
        }
    }
}
