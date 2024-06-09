import java.util.*;
public class infixTopostfix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String infix = sc.next();
        StringBuilder postfix = new StringBuilder() ;
        Stack<Character> st=new Stack<>();
        for(int i =0 ;i<infix.length();i++){
            char chr = infix.charAt(i);
            if(chr>='1' && chr<='9'){
                postfix.append(chr);
            }
            else if(chr=='('){
                st.push(chr);
            }
            else if(chr==')'){
                while(st.peek()!='('){
                    postfix.append(st.pop());
                }
                st.pop();
            }
            else if(chr=='+'|| chr=='-'){
                if(st.isEmpty()||st.peek()=='('){
                    st.push(chr);
                }
                else{

                    postfix.append(st.pop());
                    st.push(chr);
                }

            }
            else if(chr=='*' || chr=='/'){
                if(st.isEmpty()||st.peek()=='('||st.peek()=='+'||st.peek()=='-'){
                    st.push(chr);
                }
                else{
                    postfix.append(st.pop());
                    st.push(chr);
                }

            }

        }
        while(!st.isEmpty()){
            postfix.append(st.pop());
        }
        System.out.println(postfix);



    }
}
