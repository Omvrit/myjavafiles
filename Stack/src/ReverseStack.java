import java.util.Stack;
public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> st,int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int x = st.pop();
        pushAtBottom(st,ele);
        st.push(x);
    }
    public static void recursive(Stack<Integer> st){

        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        recursive(st);
        st.push(top);

    }
    public static void main(String[] args) {

        Stack<Integer> st= new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
//        System.out.println(st.push(30));
//        System.out.println(st.elementAt(0));
//        st.pop();
//        Stack<Integer> rev_st = new Stack<>();
//        while(!st.isEmpty()){
//            rev_st.push(st.pop());
//        }
//        System.out.println(rev_st);
        recursive(st);
        System.out.println(st);
    }
}