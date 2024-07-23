import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs =  new LinkedHashSet<>();
        lhs.add(12);
        lhs.add(42);
        lhs.add(67);
        System.out.println(lhs);
    }
}