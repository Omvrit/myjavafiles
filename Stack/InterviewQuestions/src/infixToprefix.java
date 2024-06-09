import java.util.Scanner;
import java.util.Stack;

public class infixToprefix{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder inifix  = new StringBuilder(sc.next());
        StringBuilder fakeinifix = new StringBuilder(inifix.reverse());


        
        StringBuilder prefix = new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i =0 ;i<fakeinifix.length();i++){
            char chr = fakeinifix.charAt(i);
            if(chr>='1' && chr<='9'){
                prefix.append(chr);
            }
            else if(chr==')'||st.isEmpty()||chr=='*'|| chr=='/'){
                st.push(chr);
            }
            else if(chr=='('){
                while(st.peek()!=')'){
                    prefix.append(st.pop());
                }
                st.pop();
            }
            else if(chr=='+'|| chr=='-'){
                if(st.peek()==')'||st.peek()=='+'|| st.peek()=='-'){
                    st.push(chr);
                }
                else{
                    while(!st.isEmpty() &&(st.peek()!=')' || st.peek()!='+'|| st.peek()!='-')){
                        prefix.append(st.pop());

                    }
                    st.push(chr);

            }}

        }

        while(!st.isEmpty()){
            prefix.append(st.pop());
        }
        prefix.reverse();
        System.out.println(prefix);



    }

}
