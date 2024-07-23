package ArrayList;

import java.util.Arrays;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(3,4,21,6,7);
        li.forEach(System.out::println);
    }
}