import java.util.Scanner;

public class binarytriangle {
    public static void main(String[] args) {
        int m,n;
        Scanner scan = new Scanner(System.in);
        m= scan.nextInt();
        int a;


        for(int i=1;i<=m;i++){
            if(i%2==0){
                a=0;
            }
            else{
                a=1;
            }

            for(int j=1;j<=i;j++) {
                System.out.print(a);
                if( a==1 ){
                    a=0;


                }
                else{
                    a=1;
                }


            }
            System.out.println();
        }
    }
}
