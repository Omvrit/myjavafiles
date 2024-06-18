import java.util.*;
class MyStack {

    Queue<Integer> q  = new LinkedList<>();
    int size = 0;

    public MyStack() {

    }
    public static void reverserec(Queue<Integer> R){
        if(R.isEmpty()){
            return;
        }
        int x = R.remove();
        reverserec(R);
        R.add(x);


    }
    public void reverse(){
        reverserec(q);
    }

    public void push(int x) {
        q.add(x);
        size++;;

    }

    public int pop() {
        int x ;
        reverserec(q);
        x=q.remove();
        reverserec(q);
        size--;
        return x;

    }

    public int top() {
        reverserec(q);
        int x = q.peek();
        reverserec(q);
        return x;
    }

    public boolean empty() {
        if(size==0) return false;
        else{
            return true;
        }
    }
}


public class implementQueueUsingStack {
    public static void main(String[] args) {



    MyStack ms = new MyStack();
    ms.push(1);
    ms.push(2);
    System.out.println(ms.top());

}
}
