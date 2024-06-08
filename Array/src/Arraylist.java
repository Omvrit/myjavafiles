import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        int n = 10;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n ; i++ ){
            arr.add(i);
        }
       for(int ele:arr){
           System.out.println(ele);
       }
    }


}
