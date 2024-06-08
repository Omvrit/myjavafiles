public class nextgreatestelement {
    public static void main(String[] args) {
        int []arr={12,8,60,37,2,49,16,28,21};
        int []nextgi =new int[arr.length];
//        int max=arr[0];
        int len = arr.length;
//
//        int i = 0;
//        while(i< arr.length-2){
//            if(arr[i]==max){
//                max= arr[i+1];
//                for(int j = i+2;j< arr.length;j++){
//                   if(arr[j]>max){
//                       max = arr[j];
//                   }
//
//                }
//                nextgi[i] = max;
//            }
//            else{
//               nextgi[i] = max;
//            }
//
//
//
//            i++;
//        }
//        nextgi[arr.length- 1]=-1;
//        nextgi[arr.length- 2]=arr[arr.length-1];
//        for (int j = 0; j < len; j++) {
//            System.out.print(nextgi[j]+" ");
//        }

        ////More optimized approach
        ////More optimized approach
        ////More optimized approach



        int max= Integer.max(arr[len-1],arr[len-2]);

        for(int m = arr.length-3;m>-1;m--){
            nextgi[m] = max;
            if(arr[m]>max){
                max= arr[m];
            }
        }
        nextgi[len-2] = arr[len-1];
        nextgi[len- 1]= -1;
        for (int j = 0; j < len; j++) {
            System.out.print(nextgi[j]+" ");
        }
}
}
