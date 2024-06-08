import java.util.Arrays;

public class KthLargestNumber {
    static int ans  = 0;
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

    public static void  QuickSelect(int []arr,int lo,int hi,int k) {

        if(hi<lo) return;

        int pivotidx = lo;
            int pivotEle = arr[pivotidx];
            for (int i = lo + 1; i <= hi; i++) {
                if(arr[i]<=pivotEle){
                    pivotidx++;
                }
            }
        swap(arr,lo,pivotidx);
        partition(arr,lo,hi,pivotidx);
            if(pivotidx == k-1) {ans= arr[pivotidx];}
            if(pivotidx>k-1)
            QuickSelect(arr,lo,pivotidx-1,k);
            else QuickSelect(arr,pivotidx+1,hi,k);

    }
    public static void main(String[] args) {
        int []arr = {4};

        System.out.println(Arrays.toString(arr));
        int k =1;
        int n = arr.length;
        ans = -1;
        QuickSelect(arr,0, n-1,n-k+1);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);

    }
}
