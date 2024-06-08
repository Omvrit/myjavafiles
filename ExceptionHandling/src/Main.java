import java.util.Scanner;
class ZeroError extends Exception{
    String msg;
    ZeroError() {
    msg = "ZeroError";

    }

}
public class Main {
    public static void main(String[] args) throws ArithmeticException, ZeroError {
        int i = -10;
        
        for (int j = i; j < 10; j++) {
            if(j==0) throw new ZeroError();
            System.out.println(500 / j);



        }



        }
    }
