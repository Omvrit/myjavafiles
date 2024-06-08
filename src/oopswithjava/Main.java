package oopswithjava;



import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void change(int a){
        a=10;
        System.out.println(a);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.set(0,90);
        System.out.println(arr.size());
        System.out.println(arr.get(0));

    }

}
