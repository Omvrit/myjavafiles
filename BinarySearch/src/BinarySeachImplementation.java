public class BinarySeachImplementation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 3;
        int index= 0;
        int start = 0;
        int flag= -1;
        int end = arr.length-1;
        while(start<=end){
            int mid = start-(start-end)/2;
            if(target == arr[mid]) {index = mid;flag = 1;break;}
            else if(target<arr[mid]){end = mid-1;}

            else{start = mid+1;}
        }
        if(flag==1) System.out.println("element found at: "+index);
        else{
            System.out.println("element not found");
        }
    }
}
