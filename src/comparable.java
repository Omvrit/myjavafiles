import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class student implements Comparable<student> {
    int rollno;
    String name;
    public student(String name,int rollno){
        this.name = name;
        this.rollno = rollno;

    }

    @Override
    public String toString() {
        return "student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(student o) {
        if(this.rollno == o.rollno){
            return this.name.compareTo(o.name);
        }
       return this.rollno - o.rollno;
    }
}


public class comparable {

    public static void main(String[] args) {
        List<student> li =new ArrayList<>();
        li.add(new student("or",21));
        li.add(new student("om",21));
        li.add(new student("od",24));
        li.add(new student("ods",31));
        li.add(new student("oo",29));
        li.add(new student("op",25));
        System.out.println(li);
        Collections.sort(li);
        System.out.println(li);



    }
}