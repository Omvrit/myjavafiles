package ArraysList;
//using comparator->better ;
//using comparable;
//using comparator->better ;
//using comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}

class StudentRollComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getRollNumber(), student2.getRollNumber());
    }
}

public class SortObjectsOnTheBasisOfAnyValue {
    public static void main(String[] args) {
        // Create some student objects
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 103);
        Student student3 = new Student("Charlie", 102);

        // Create an ArrayList to hold the students
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        // Print the unsorted list
        System.out.println("Unsorted list:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort the students based on their roll numbers using the comparator
        Collections.sort(students, new StudentRollComparator());

        // Print the sorted list
        System.out.println("\nSorted list based on roll numbers:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
