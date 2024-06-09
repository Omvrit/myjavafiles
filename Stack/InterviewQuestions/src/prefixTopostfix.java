import java.util.Scanner;
import java.util.Stack;
import java.lang.*;

public class prefixTopostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> st = new Stack<>();
        String str = sc.next();
        for(int i = str.length()-1;i>=0;i--) {
            char ch = str.charAt(i);
            if(ch>='1' && ch<='9'){
                st.push(ch+"");
            }
            else{
                String val1= st.pop();
                String val2 = st.pop();
                st.push(val1+val2+ch);
            }



        }
        System.out.println(st.pop());




    }
}