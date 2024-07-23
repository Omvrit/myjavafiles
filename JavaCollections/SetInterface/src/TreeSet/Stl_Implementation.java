package TreeSet;

import com.sun.source.tree.Tree;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Stl_Implementation {
    public static void main(String[] args) {
       Set<Integer> s = new TreeSet<>();
        s.add(33);
        s.add(37);
        s.add(39);
        s.add(34);
        s.add(30);
        s.add(31);
        s.add(38);
        s.remove(23);
        s.add(35);
        System.out.println(s);
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(2);
    }
}
