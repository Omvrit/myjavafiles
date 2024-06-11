import java.util.Deque;
import java.util.LinkedList;

public class DequeueSTL {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(20);// adds at last;
        dq.add(30);//adds at last;
        dq.remove();//removes first;
    }
}
