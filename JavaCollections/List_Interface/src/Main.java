import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> arraysList = new ArrayList<>();
        List<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(400);
        ll.add(500);

        System.out.println(ll);

    }
}