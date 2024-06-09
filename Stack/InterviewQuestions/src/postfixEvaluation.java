import java.util.*;

public class postfixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        String str = sc.next();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='1' && ch<='9'){
                st.push((int)ch-48);
            }
            else{
                int val2 = (st.pop());
                int val1 = (st.pop());
                if(ch=='+'){
                    st.push((val1+val2));
                }
                if(ch=='-'){
                    st.push((val1-val2));
                }
                if(ch=='/'){
                    st.push((val1/val2));
                }
                if(ch=='*'){
                    st.push((val1*val2));
                }

            }
        }
        System.out.println(st.pop());
    }
}
