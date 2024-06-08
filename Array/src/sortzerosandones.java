import java.util.Arrays;

public class sortzerosandones {
    public static void main(String[] args) {
        int []arr = {0,0,0,1,1,1};
        int n = arr.length;

        int j =n-1;

       for(int i=0;i<j;) {
           if(arr[i] == 1 && arr[j] == 0) {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i++;
               j--;
           }
           else if(arr[i]==0){
               i++;
           }
           else if(arr[j]==1){
               j--;
           }
           else{
                i++;
                j--;
           }
       }

        System.out.println(Arrays.toString(arr));
    }
}
