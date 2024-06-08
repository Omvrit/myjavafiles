package twoDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class PrintPascalsTriangle {
    public static void main(String[] args) {
        int numRows = 7;
        List<List<Integer>> l = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> l1 = new ArrayList<>();
            for(int j =0;j<=i;j++){
                l1.add(1);
            }
            l.add(l1);
        }


        for (int i = 2; i < numRows; i++) {
            for(int j =1;j<i;j++){
               l.get(i).set(j,l.get(i-1).get(j)+l.get(i-1).get(j-1));
            }

        }
        for(int i =0;i<l.size();i++){
            System.out.println(l.get(i));
        }


    }
}
