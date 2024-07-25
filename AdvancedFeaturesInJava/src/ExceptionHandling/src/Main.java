class ZeroError extends Exception{
    String msg;
    ZeroError(String msg) {
    super(msg);
    }

}
public class Main {
    public static void main(String[] args) throws ZeroError {
        int i = -10;
        for (int j = i; j < 10; j++) {
            if(j==0) throw new ZeroError("saale zero se divide kar ditta");
            System.out.println(500 / j);
        }



        }
    }


