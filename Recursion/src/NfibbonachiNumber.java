public class NfibbonachiNumber {
    public static int fibbo(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        return fibbo(n-1)+fibbo(n-2);

    }
    public static void main(String[] args) {
        int n = 10 ;
        int i = 1;
        while(i<=n){
            System.out.println(fibbo(i)+" ");
            i++;
        }


    }
}
