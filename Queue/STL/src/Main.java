import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void display(Queue<Integer> q){
        if(q.isEmpty()){
             return;
        }
        int x = q.poll();
        System.out.println(x);
        display(q);
        q.add(x);

    }
    public static void revdisplay(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int x = q.poll();
        revdisplay(q);
        System.out.println(x);
        q.add(x);

    }
    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(6);q.add(5);
        revdisplay(q);
        display(q);

    }
}