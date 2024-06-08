import java.util.Stack;
public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> stcopy = new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.pop());

        }
        while(!st2.isEmpty()){
            stcopy.push(st2.pop());

        }
        System.out.println(stcopy);

    }
}
