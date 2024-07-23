import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(21);
        ts.add(11);
        ts.add(51);
        ts.add(31);
        ts.add(91);
        ts.add(81);
        System.out.println(ts);
        ts.add(31);

        System.out.println(ts);

    }
}