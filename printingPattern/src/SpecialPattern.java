import java.util.Scanner;

public class SpecialPattern {
    public static void main(String[] args) {
        int m;
        Scanner scan = new Scanner(System.in);
        m= scan.nextInt();
        int j =1;

        for(int i=1;i<=m;i++){
            while (j<=j+i+1) {
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }
    }
}
