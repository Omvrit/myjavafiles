package StreamApi;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(2,4,5,7,1,9,5,20,32,54,29);
//        li.forEach(System.out::println);
        /* 1->creating stream */
        Stream<Integer> data = li.stream();
        /*2->Intermediate operations-:*/

//        System.out.println(data.count());
        //.sorted()
//        Stream<Integer> sortedData=data.sorted();
//        sortedData.forEach(n-> System.out.println(n));
        //.filter()
//        Stream<Integer> filtered=data.filter(x->x%2==0);
//        filtered.forEach(x-> System.out.println(x));
        //.map()
//        Stream<Integer> mapped =data.map(x->2*x);
//        mapped.forEach(System.out::println);
        /*Collecting using collectors like List,Arrays*/
//        List<Integer> list  = data.sorted().filter(x->x%2==1)
//                .map(x->x*2)
//                .collect(Collectors
//                        .toList());
        int afteradding  = data.sorted().filter(x->x%2==1)
                .map(x->x*2)
                .reduce(0, Integer::sum);

        System.out.println(afteradding);









    }
}
//What is a stream?
/*
1-Stream is a sequence of data from collections through an operational pipeline that us to do various operations on the data
2-An Stream can only be consumed once.
3-
 */
