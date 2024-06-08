import java.util.ArrayList;

public class PrintAllincreasingseqkandn {
    public static void print(int i,int n,int k , ArrayList<Integer> arr){
        if(arr.size() == k){
            System.out.println("->"+arr);
            return;
        }
        if(i>n){
            return;
        }

        else{
            ArrayList<Integer> arr1 = new ArrayList<>(arr);
            print(i+1,n,k,arr1);
            arr.add(i);
            print(i+1,n,k,arr);
        }
    }
    public static  void main(String[] args) {
        int n =6;
        int k =4;
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        print(1,n,k,l1);

    }
}
