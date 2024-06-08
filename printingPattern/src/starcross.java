import java.util.Scanner;

public class starcross {
    public static void main(String[] args) {
        int m,n;
        Scanner scan = new Scanner(System.in);
        m= scan.nextInt();

        int a = 1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++) {
                if (i == j || i+j==m+1) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
