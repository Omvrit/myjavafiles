import java.util.*;


public class InfixEvaluation {
    public static void eval(Stack<Integer> st, char op){
        if(op=='('|| op==')'){
            return;
        }
        int val2 = st.pop();
        int val1 = st.pop();
        if(op=='-'){
            st.push(val1-val2);
        }
        if(op=='/'){
            st.push(val1/val2);
        }
        if(op=='*'){
            st.push(val1*val2);
        }
        if(op=='+'){
            st.push(val1+val2);
        }


    }
    public static void main(String[] args) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i =0 ;i<str.length();i++){
            int ch = str.charAt(i);
            char chr = str.charAt(i);
            if(ch>=48 && ch<=57){
                val.push(ch-48);
            }
            else{
                if(op.isEmpty()||chr=='('||op.peek()=='('){
                    op.push(chr);
                }
                else{
                    if(chr == '+' || chr=='-'){
                        if(op.peek()!='('){
                            eval(val,op.pop());
                        }

                        op.push(chr);
                    }
                    if(chr=='*' || chr=='/'){
                        if(op.peek()=='+'||op.peek()=='-'||op.peek()=='('){
                            op.push(chr);
                        }
                        else{
                            eval(val,op.pop());
                            op.push(chr);
                        }
                    }

                    if(chr==')'){
                        while(op.peek()!='('){
                            eval(val,op.pop());
                        }
                        op.pop();
                    }

                }
            }

        }
        while(val.size()>1){
            eval(val,op.pop());
        }
        System.out.println("ANS:"+val.pop());

    }
}
