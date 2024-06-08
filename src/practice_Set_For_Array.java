import java.util.Scanner;
public class practice_Set_For_Array {
    public static void main(String[] args) {
        //practice question 1
        Scanner scanner = new Scanner(System.in);
        /*float sum=0;
        int i;
        float [] marks = new float[5];


        for( i = 0; i < marks.length ; i++){
            System.out.println("enter");
            marks[i] = scanner.nextFloat();
            sum = (sum + marks[i]);

        }
        System.out.println(sum);
//using above code we will find i any number is in the array
        float numToFInd = 34f;
        for(i = 0 ; i<marks.length;i++){
            if(marks[i]==numToFInd){
                System.out.println("yes number exist");
                break;

            }


        }
        //avg of all the marks using for each loop
        float avg = 0 ;
        for (float element:marks){
            avg = avg + element;


        }
        System.out.println(avg/5);
*/

        // adding two matrices of order 2*3;
       /* int [][]mat1={{1,2,3},{2,4,3}};

        int [][]mat2= {{2,3,4},{3,5,4}};
        int [][]mat3= new int[2][3];
        for(int i=0;i< mat1.length;i++){
            for(int j =0;j<mat1[i].length;j++)
            {
                mat3[i][j] = mat1[i][j] + mat2[i][j];

            }

        }
        for(int i=0;i< mat1.length;i++){
            for(int j =0;j<mat1[i].length;j++)
            {
                System.out.println(mat3[i][j]);

            }
            System.out.println("");
        }*/
        /* reversing an array
        int []array = {1,2,3,4,5};
        for(int i = 0 ; i<(array.length)/2;i++){
            int temp = array[i];
            array[i]=array[4-i];
            array[4-i] =temp;


        }
        for(int i = 0 ; i<(array.length);i++) {
            System.out.println(array[i]);
        }*/
        // min element in array
        int sum = 0;
        int i;
        int[] marks = new int[5];


        for (i = 0; i < marks.length; i++) {
            System.out.println("enter");
            marks[i] = scanner.nextInt();


        }
        int max = marks[0];
        for (i = 1; i < marks.length; i++) {

            if (max <= marks[i]) {
                max = marks[i];
            }

        }

        System.out.println(max);
        //checking if the array is sorted or not

        for (i = 0; i < marks.length-1; i++) {

            if (marks[i]>= marks[i+1]) {
                System.out.println("array is not sorted");
                break;
            }
            else {
                System.out.println("array is sorted");
                break;
            }

        }
    }
}