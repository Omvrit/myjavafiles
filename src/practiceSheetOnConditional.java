import java.util.Scanner;
public class practiceSheetOnConditional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* System.out.println("enter number in 1st subject ");
        int sub1 = scan.nextInt();
        System.out.println("enter number in 2nd subject");
        int sub2 =scan.nextInt();
        System.out.println("enter number in 3rd subject");
        int sub3=scan.nextInt();
        int percentage = (sub1 + sub2 + sub3)/3;
        if (percentage>=40&&(sub1 >= 33&&sub2>=33)&&sub3>=33){
            System.out.println("you pass");
        }
        else{
            System.out.println("you failed but keep trying");
        }*/
        //second question

        /*System.out.println("enter salary in lacs");
        float sal = scan.nextFloat();
        float tax = 0;
        if(sal<2.5){

            tax = 0;

        }

        else if(sal>2.5&&sal<=5){
            tax = (sal*0.05f) ;

        }
        else if(sal>5f && sal <=10f){
            tax = ((5f*0.05f)+((sal -2.5f)*0.2f));
        }
        else if(sal>10){
            tax= ((5f*0.05f)+(sal-2.5f)*0.2f+(sal - 7.5f)*.3f);
        }
        System.out.println("tax you have to pay is "+tax+"L");
        int number = scan.nextInt();
        switch (number) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            }
        System.out.println("enter any year");
        int year = scan.nextInt();
        if (year % 400 == 0 || year % 4 == 0) {
            System.out.println("year entered is a leap year");
        }
        else{
            System.out.println("year entered is not a leap year");
        }*/
        //question
        System.out.println("Enter website ");
        String web = scan.nextLine();
        if (web.endsWith(".com")){
            System.out.println("it is a commercial website");

        }
        else if(web.endsWith(".in")){
            System.out.println("it is a indian website");
        }
        else if(web.endsWith(".org")){
            System.out.println("It is a organisation website" );
        }

    }
}