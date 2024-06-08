public class Sumfrom1toN {
    public static int sum(int n){
        if(n == 1 || n==0) return n ;
        else return n+sum(n-1);
    }
    public static void main(String[] args) {
        int n = 1;
        System.out.println(sum(n));
    }
}
