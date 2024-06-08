import java.util.Scanner;


public class ChangeString {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        String str2= "";
        for(int i =1;i<str.length();i+=2){
            str = str.substring(0,i)+"a"+str.substring(i+1);

        }
        System.out.println(str);



    }
}
