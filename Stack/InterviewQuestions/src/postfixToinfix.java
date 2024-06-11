import java.util.Scanner;
import java.util.Stack;

public class postfixToinfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> st = new Stack<>();
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>='1' && ch<='9'){
                st.push(ch+"");

            }
            else{
                String val2 = st.pop();
                String val1 = st.pop();
                if(ch=='+'||ch=='-'){
                    st.push('('+val1+ch+val2+')');
                }
                else{

                st.push(val1+ch+val2);}
            }

        }
        System.out.println(st.pop());
    }
}
