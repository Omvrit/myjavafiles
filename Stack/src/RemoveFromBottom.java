import java.util.Stack;

public class RemoveFromBottom {
    public static void recursive(Stack<Integer> st) {
        if(st.size()==1){
            st.pop();
            return;
        }
        int top = st.pop();
        recursive(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st  = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        recursive(st);
        System.out.println(st);
    }
}
