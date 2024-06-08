import java.util.*;
import java.util.Stack;

public class PushAnAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        int index = 3;
        int ele = 10;

        System.out.println(st);
        Stack<Integer> st2 = new Stack<>();
        while(st.size()>index){
            st2.push(st.pop());
        }
        st.push(10);
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
        System.out.println(st);

    }
}
