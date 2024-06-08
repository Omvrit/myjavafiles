import java.util.Scanner;

import static java.lang.Math.min;

public class LowerBound {
    public static void main(String ...args){
        int []arr = {10,20,30,30,40,50,60,70};
        Scanner scan  = new Scanner(System.in);
       int target = scan.nextInt();

        int lo = 0;
        int high = arr.length-1;


//        else{
//        for(int i =0;i<arr.length;i++){
//            if(target==arr[i]){
//                lb= i;
//                break;
//            }
//            else if(target>arr[i]){
//                lb= i;
//            }
//        }}
            //using binary search
            int lb  =  arr.length-1;
//            while(lo<=high){
//
//                int mid = lo - (lo-high)/2;
//
//           if(arr[mid]>=target){
//                    lb = min(lb,mid);
//                    high = mid -1;
//                }
//           else{
//
//               lo = mid  +1;
//           }
//
//        }
            //upper bound implementation
        lb = 8;
        while(lo<=high){

            int mid = lo - (lo-high)/2;

            if(arr[mid]>target){
                lb = min(lb,mid);
                high = mid -1;
            }
            else{

                lo = mid  +1;
            }

        }



        System.out.println("upper bound of "+target+" is "+lb);


    }
}
