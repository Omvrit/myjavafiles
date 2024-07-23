package Comparable;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class student implements Comparable<student>{
    int roll;
    String name;
    student(int roll,String name){
        this.roll = roll;
        this.name= name;
    }
    @Override
    public int compareTo(student s){
        return this.roll-s.roll;
    }


    @Override
    public String toString() {
        return "student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
public class use {
    public static void main(String[] args) {
        List<student> st = new ArrayList<student>();
        st.add(new student(2,"ram"));
        st.add(new student(4,"shyam"));
        st.add(new student(8,"shraam"));
        st.add(new student(10,"mariam"));
        st.add(new student(23,"radheyram"));
        st.add(new student(40,"shyamram"));
        Collections.sort(st);
        st.forEach(System.out::println);

    }

}
