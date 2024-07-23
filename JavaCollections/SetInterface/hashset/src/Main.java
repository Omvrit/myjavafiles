import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
class person{
    private String name;
    int age;

    public person(String  name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "["+name+" "+age+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class Main {
    public static void main(String[] args) {
//        HashSet<Integer> hs = new HashSet<>();
//        hs.add(12);
//        hs.add(23);
//        hs.add(54);
//        hs.add(29);
//        hs.add(27);
//        hs.add(21);
//        hs.remove(21);
//
//        System.out.println(hs);
        //hashset of custom class
        HashSet<person> p = new HashSet<>();
        p.add(new person("hdgdgd",21));
        p.add(new person("hdgdgd",21));
        p.add(new person("hdgd21gd",21));
        p.add(new person("hdhgfgdgd",21));
        System.out.println(p);


    }
}