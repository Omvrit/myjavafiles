package STL;

import java.util.LinkedList;

public class stl {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(30);
        l.add(30);
        l.add(40);
        System.out.println(l);
        l.addFirst(20);
        System.out.println(l);

    }
}
