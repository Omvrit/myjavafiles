public class Mergetwosortedarray {
    public static void main(String[] args) {
        int []arr1 = {11,33,42,71,90};
        int []arr2 = {26,54,69,81};

        int []arr3 = new int[arr1.length+ arr2.length];

        int arr1len  = arr1.length;
        int arr2len = arr2.length;
        int arr3len = arr3.length;

        int i = arr1len-1;
        int j =arr2len-1;
        int a =arr3len-1;

        while(a>=0){

            if(i >=0 && j >=0){
                if(arr1[i]>arr2[j]){
                    arr3[a] = arr1[i];
                    i--;
                }
                else{
                    arr3[a]=arr2[j];
                    j--;
                }
                a--;
            }
            else if(i==-1){
                while(j>=0){
                    arr3[a]=arr2[j];
                    j--;
                    a--;
                }
                break;
            }
            else{
                while(i>=0){
                    arr3[a]=arr1[i];
                    i--;
                    a--;
                }
                break;
            }




        }
        for (int value : arr3) {
            System.out.println(value);
        }

    }
}
