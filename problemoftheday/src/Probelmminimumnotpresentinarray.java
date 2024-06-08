import java.util.Arrays;

public class Probelmminimumnotpresentinarray {
    public static void main(String[] args) {
        int []arr = {};
        int size = arr.length;
        int min = Integer.MAX_VALUE;//positivemin
        int nonrelevant = 0;
        for(int i =0 ;i<size;i++){
            if(arr[i]>0 && arr[i]<min){
                min = arr[i];
            }
            if(arr[i]<0 || arr[i]>size){
                arr[i] = 0;
                nonrelevant++;
            }
        }
        System.out.println(Arrays.toString(arr));
        int missing = 1;
        if(min==1){
            int newsize = size - nonrelevant;
            System.out.println(newsize);
            int sum = (newsize*(newsize+1))/2;
            for (int i = 0; i < size; i++) {
                sum =sum-arr[i];
            }
            if(sum == 0){
                missing = newsize+1;
            }
            else{
                missing = Math.abs(sum);
            }
        }
        System.out.println(missing);
    }
}
