package ArraysList;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        int ar[] = new int[10];
        int n = 10;
        for (int i = 0; i < n ; i++ ){
            ar[i] = i;
        }

        //<Integer> is wrapper class
        ArrayList<Integer> arr = new ArrayList<>();




       for(int ele:ar){
           System.out.println(ele);
       }
    }


}
