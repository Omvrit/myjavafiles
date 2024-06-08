public class MergeTwoSortedArray {
    public static void Merge(int [] arr1,int [] arr2,int []arr3){

        int i = 0 ;//arr1
        int j  =0 ;//arr2
        int k = 0 ;//arr3
        while(k<arr3.length){
            if(i< arr1.length && j< arr2.length){
                if(arr1[i]>=arr2[j]) arr3[k++] = arr2[j++];
                else arr3[k++] = arr1[i++];
            }
            else{
                if(i == arr1.length) while(k< arr3.length)
                        arr3[k++] = arr2[j++];
                else while(k< arr3.length )
                    arr3[k++] = arr1[i++];
            }
        }
    }
    public static void main(String[] args) {
        int [] arr1 = {60};
        int [] arr2 = {40};
        int []arr3 =new int [arr1.length+arr2.length];
        Merge(arr1,arr2,arr3);
        int i  =0 ;
        for ( i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }
}