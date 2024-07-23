import java.beans.IntrospectionException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
class Student{
    int rollNo;
    String name;

    public Student(int rollNo,String  name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name=" + name +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
}

public class Main {
    public static void main(String[] args) {
        //normal hashset
//        Set<Integer> set = new HashSet<>();
//        set.add(Integer.valueOf(12));
//        set.add(23);
//        set.add(11);
//        set.remove(12);
////        set.add(12);
////        set.add(12);
//        System.out.println(set);
//        Integer a = Integer.valueOf(12);
//        System.out.println(a.toString());
        //hashset on custom class
        Set<Student> set = new HashSet<>();
        set.add(new Student(1,"ombrit"));
        set.add(new Student(1,"ombrit"));
        set.add(new Student(1,"ombrit"));
        System.out.println(set);





    }


}