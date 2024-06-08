import java.util.Arrays;

public class sortarraysofzotdutchflagalgorithm {
    public static void main(String[] args) {
        int[] arr = {2,0,1};
        int j = arr.length-1;

//        for(int i =0;i<j;i++){
//            if(arr[i]==1  && arr[j]==0){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                i++;
//                j--;
//            }
//            else if(arr[i]==2  && arr[j]==0){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                i++;
//                j--;
//            }
//            else if(arr[i]==2  && arr[j]==1){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                j--;
//
//            }
//
//
//            else if(arr[i]==0){
//                i++;
//            }
//            else if(arr[j]==2){
//                j--;
//            }
//        }
        int n = arr.length;
        int low = 0;
        int high = n-1;
        for(int mid = 0;mid<=high;){
            if(arr[mid] == 0){
                arr[mid] = arr[low];
                arr[low]=0;
                low++;mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                arr[mid] = arr[high];
                arr[high]=2;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
