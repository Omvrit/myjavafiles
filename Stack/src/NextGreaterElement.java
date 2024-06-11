import java.util.*;
import java.util.Stack;

public class NextGreaterElement {
    public static void ngebyvalue(int []arr,int[]nge){
        Stack<Integer> st = new Stack<>();
        int size = arr.length;
        nge[size-1] = size;
        st.push(arr[size-1]);
        for(int i = size-2;i>=0;i-- ){
            if(arr[i]>=st.peek()){
                while(!st.isEmpty() && arr[i]>=st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    nge[i] = size;
                }
                else{
                    nge[i] = st.peek();
                }
            }
            else{
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
    }
    public static void ngebyIndex(int []arr,int[]nge){
        Stack<Integer> st = new Stack<>();
        int size = arr.length;
        st.push(size-1);
        nge[size-1] = size;
        for(int i = size-2;i>=0;i-- ){

                while(!st.isEmpty() && arr[i]>=arr[st.peek()])
                    st.pop();

                if(st.isEmpty())
                    nge[i] = size;

                else
                    nge[i] = st.peek();


            st.push(i);
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,3,-1,-3,5,3,6,7};
        int ngebyval[]  = new int [arr.length];
        int ngebyin[] = new int[arr.length];
        ngebyvalue(arr,ngebyval);
        System.out.println(Arrays.toString(ngebyval));
        ngebyIndex(arr,ngebyin);
        System.out.println(Arrays.toString(ngebyin));
    }

}
