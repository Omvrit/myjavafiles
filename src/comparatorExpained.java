import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class user {
    int serialnumber;
    String name;

    @Override
    public String toString() {
        return "user{" +
                "serialnumber=" + serialnumber +
                ", name='" + name + '\'' +
                '}';
    }

    public user(String name, int serialnumber) {
        this.name = name;
        this.serialnumber = serialnumber;
    }
}

    public class comparatorExpained {
        public static void main(String[] args) {
            List<user> li = new ArrayList<>();
            li.add(new user("om",21));
            li.add(new user("or",28));
            li.add(new user("od",24));
            li.add(new user("ods",31));
            li.add(new user("oo",29));
            li.add(new user("op",25));
            //using anonymous class that implements comparator
//            li.sort(new Comparator<user>(){
//
//                @Override
//                public int compare(user o1, user o2) {
//                    return o1.serialnumber-o2.serialnumber;
//                }
//            });
            //Or we could use lambda expressions
            li.sort( ( o1, o2)-> o1.serialnumber - o2.serialnumber);
            System.out.println(li);


        }
    }

