public class tarversingAnArrayUsingRecursion {
    public static void print(int [] arr,int size){
        if(size == 0) return;
        print(arr,size -1);
        System.out.println(arr[size-1]);

    }
    public static void main(String[] args) {
        int []arr = {2,3,4,5,6,7,8,8};
        print(arr,8);
    }
}
