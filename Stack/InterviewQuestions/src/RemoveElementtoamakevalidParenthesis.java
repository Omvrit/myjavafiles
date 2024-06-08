import java.util.Scanner;
import java.util.Stack;


public class RemoveElementtoamakevalidParenthesis {

    public static int removed(String str){
        Stack<Character> st = new Stack<>();
        int removed = 0;
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
                    removed++;
                }
            }
        }
        removed+=st.size();
        return removed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        System.out.println(removed(str));






    }
}
