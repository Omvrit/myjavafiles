import java.awt.*;
import java.util.Stack;

public class DisplayUsingRecursion {
    public static void print(Stack<Integer>st){
        if(st.isEmpty()) return;
        int x = st.pop();
        print(st);
        System.out.println(x);
        st.push(x);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        print(st);
        System.out.println(st);



    }
}
