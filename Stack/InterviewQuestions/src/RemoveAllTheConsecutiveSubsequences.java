import java.util.Scanner;
import java.util.Stack;


public class RemoveAllTheConsecutiveSubsequences {
    public static void display(Stack<Character> st){
        if(st.isEmpty()){
            return;
        }
        char x = st.pop();
        display(st);
        System.out.println(x);
    }
    public static Stack<Character> function(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<str.length();){
            char ch = str.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
                i++;
            }
            else if(st.peek()!= ch){
                st.push(ch);
                i++;
            }
            else{
                while(i<str.length() && str.charAt(i) == st.peek()){
                    i++;
                }
                st.pop();
            }

        }
        return st;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        System.out.println(function(str));




    }
}
