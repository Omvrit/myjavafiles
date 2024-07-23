import java.util.Arrays;

@interface Color{
    String name();
}
@Color(name = "RED")
public class Override {
    public static void main(String[] args) {


        int[] arr = {2, 5, 1, 6, 9};
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);
        for (int ele:arr){
            System.out.println(ele);
        }
    }

}