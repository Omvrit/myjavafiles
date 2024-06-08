import java.util.Scanner;
import java.util.Random;
public class stonePaperScissorsUsing_random {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner =new Scanner(System.in);
        int comp = random.nextInt(1,3);
        int  user = 0;
        System.out.println("enter your choice : \n 1 for stone \n 2 for paper\n 3 for Scissor" );
        user = scanner.nextInt();
        if((user == 1 && comp ==1)||(user == 2 && comp ==2)||(user == 3 && comp ==3) ){
            System.out.println("No one win");
        } else if ((user == 1 && comp ==3)||(user == 2 && comp == 1)||(user == 3 && comp == 2)) {
            System.out.println("you win");

        }
        else if((user == 3 && comp ==1)||(user == 1 && comp == 2)||(user == 2&& comp == 3)){
            System.out.println("you loose");
        }
        else{
            System.out.println("enter valid choice");
        }
    }
}
