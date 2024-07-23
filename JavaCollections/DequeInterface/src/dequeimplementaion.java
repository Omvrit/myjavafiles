import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class dequeimplementaion {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>() ;
        dq.add(12);
        dq.add(23);
        dq.add(33);
        dq.add(43);
        dq.add(53);
        dq.remove();
        System.out.println(dq);


    }
}