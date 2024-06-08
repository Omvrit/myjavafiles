import java.util.Scanner;

public record rhombus() {
    public static void main(String[] args) {
        int m, n;
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        int a;
        for (int i = 1; i <=m; i++) {
            a = 1;
            for (int j = 1; j<=m-i ; j++) {
                System.out.print(" "+" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for (int j = 1; j<=m-i ; j++) {
                System.out.print("*"+" ");
            }

            for(int k=1;k<i;k++){
                System.out.print(" "+" ");
            }

            System.out.println();
        }
    }
}
