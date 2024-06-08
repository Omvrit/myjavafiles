import java.util.Scanner;

public class starBridgePattern {
    public static void main(String[] args) {

        int m, n;
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= m-i+1 ; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j<i ; j++) {
                System.out.print(" " + " ");
            }
            if(i==1){
                for(int j=m+1;j<=2*m-1;j++)
                {
                    System.out.print(j+" ");
                }
            }
            else {
                for(int j=i;j>2;j--){
                    System.out.print(" "+" ");
                }
                for(int j=m;j<=2*m-i;j++){
                    System.out.print((i+j-1)+" ");
                }


}
            System.out.println();


        }

    }
}
