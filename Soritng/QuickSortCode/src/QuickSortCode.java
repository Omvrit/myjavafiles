import java.util.Arrays;

public class QuickSortCode {
    public static void swap (int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void partition(int []arr,int lo,int hi,int pivotidx){
        int i = lo;
        int j = hi;
        while(i<pivotidx && j>pivotidx){
            if(arr[i]<=arr[pivotidx]) i++;
            if( arr[j]>arr[pivotidx] ) j--;
            if(arr[i]>arr[pivotidx] && arr[j]<=arr[pivotidx]) {swap(arr,i,j);i++;j--;}

        }
    }

    public static void QuickSort(int[] arr, int lo, int hi) {
        if(hi<=lo) return;
        int pivotidx = lo;
        int pivotEle = arr[pivotidx];
        for (int i = lo + 1; i <= hi; i++) {
           if(arr[i]<=pivotEle){
               pivotidx++;
           }
        }
        swap(arr,lo,pivotidx);
        partition(arr,lo,hi,pivotidx);
//
        QuickSort(arr,lo,pivotidx-1);
        QuickSort(arr,pivotidx+1,hi);


    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,5,6,2,4,7,8,5,6};
        for (int ele :
                arr) {
            System.out.print(ele + " ");
        }

        QuickSort(arr, 0, arr.length - 1);

        System.out.println();
        for (int ele :
                arr) {
            System.out.print(ele + " ");
        }
    }
}