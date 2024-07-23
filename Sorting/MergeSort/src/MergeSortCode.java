
public class MergeSortCode {
    static int count = 0;
    public static void InversionProblem(int []a,int []b){
        int i  =0 ;
        int j = 0;
        while (i<a.length && j<b.length) {

            if(a[i]>b[j]){
                count+=a.length-i;
                j++;
            }
            else{
                i++;
            }
        }
    }
    public static void merge(int [] arr1,int [] arr2,int []arr){

        int i = 0 ;//arr1
        int j  =0 ;//arr2
        int k = 0 ;//arr3

            while(i< arr1.length && j< arr2.length){
                if(arr1[i]>=arr2[j]) arr[k++] = arr2[j++];
                else arr[k++] = arr1[i++];
            }
            while(j<arr2.length) arr[k++] = arr2[j++];
            while(i<arr1.length) arr[k++] = arr1[i++];


        }
    public static void mergeSort(int [] arr) {
        int size = arr.length;
        if (size == 1) return;
        int[] a = new int[size / 2];
        int[] b = new int[size - size / 2];
        int m = 0;
        for(int i =0;i< size/2;i++){
            a[i] = arr[i];
        }
        for(int i = size / 2; i < size ; i++) {
            b[m++] = arr[i];
        }
        mergeSort(a);
        mergeSort(b);
        InversionProblem(a,b);

        merge(a,b,arr);
        //deleting array
        a=null;
        b=null;

    }
    public static void main(String[] args) {
        int[] arr = {8,2,5,3,1,4};
        for (int j : arr) {
            System.out.print(j+" ");
        }
        mergeSort(arr);
        System.out.println();
        for (int j : arr) {
            System.out.print(j+" ");
        }



        System.out.println("\n"+count);
    }

}
