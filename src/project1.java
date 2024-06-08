import java.util.Scanner;
public class project1 {
    public static void main (String[] args){
        float sub1;
        float sub2;
        float sub3;
        float sub4;
        float sub5;


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of first subject");
        sub1= scanner.nextFloat();

        System.out.println("enter number of second subject");
        sub2= scanner.nextFloat();
        System.out.println("enter number of third subject");
        sub3= scanner.nextFloat();
        System.out.println("enter number of fourth subject");
        sub4= scanner.nextFloat();
        System.out.println("enter number of fifth subject");
        sub5= scanner.nextFloat();
        float percentage = (sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println("percentage of five numbers is :"+percentage);


    }
}
