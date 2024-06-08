import java.util.Scanner;

public class USERINPUT {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name ? ");
        String name  = scan.nextLine();
        System.out.println("enter your age");
        int age = scan.nextInt();
        System.out.println("enter your favourite food");
        scan.nextLine();

        String favfood = scan.nextLine();

        System.out.println("hii "+name+" you are now : "+age +"your favourite food is"+favfood);


    }
}
