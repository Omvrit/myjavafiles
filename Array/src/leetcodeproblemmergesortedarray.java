public class leetcodeproblemmergesortedarray {
    public static void main(String[] args) {


        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {4,5,6};


        int a = 0;
        int m = 3;
        int n = 3;
        int k = m+n;
        int[] arr3 = new int[k];

        int i = 0;
        int j = 0;
        while(a<k){
            if(i<m && j<n){
            if(arr1[i]<arr2[j]){
                arr3[a] = arr1[i];
                i++;
                a++;
            }
            else{
                arr3[a]=arr2[j];
                j++;
                a++;
            }
            }
            else if(i==m){
                while(j<n){
                    arr3[a]=arr2[j];
                    j++;
                    a++;
                }
                break;
            }
            else{
               while(i<m){
                   arr3[a] = arr1[i];
                   i++;
                   a++;
               }
            }



        }
        System.arraycopy(arr3, 0, arr1, 0, k);
        for (int  l = 0; l < k; l++) {
            System.out.println(arr1[l]);
        }



    }

}
