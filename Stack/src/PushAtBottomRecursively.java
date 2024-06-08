import org.jetbrains.annotations.NotNull;

import java.util.Stack;

public class PushAtBottomRecursively {
    public static void recursivemethod(@NotNull Stack<Integer> st, int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int x = st.pop();
        recursivemethod(st,ele);
        st.push(x);
    }
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        recursivemethod(st,10);
        System.out.println(st);

    }
}
