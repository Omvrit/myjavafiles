import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        Stack<Character> st = new Stack<>();
        for(int i =0 ;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='('){
                st.push(c);

            }
            else{
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
                else{
                    System.out.println("Invalid parenthesis");
                    break;
                }
            }
        }
        if(st.isEmpty()){
            System.out.println("Valid parenthesis");
        }
        else{
            System.out.println("inValid parenthesis");
        }
    }
}