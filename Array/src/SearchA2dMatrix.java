public class SearchA2dMatrix {
    public static void main(String[] args) {
        int [][] matrix  = {{-5 }};
        int target = -5;
        int rows = matrix.length;
        int column = matrix[0].length;


        int i =0;
        int j = column - 1;
        while(i<rows-1 && j>=0){
            if(matrix[i][j]==target){

            }
            else if(matrix[i][j]<target){
                i++;}

            else{
                j--;
            }

        }



    }
}
