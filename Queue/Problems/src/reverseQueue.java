import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue{
    public static void reverse(Queue<Integer> q){
        if(q.size()==0){
            return;
        }
        int x = q.remove();
        reverse(q);
        q.add(x);
    }
    public static void reverseusingStack(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.remove());

        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        System.out.println(q);
        reverseusingStack(q);
        System.out.println(q);

    }
}