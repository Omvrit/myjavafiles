public class GCD {
    public static int bekargcd(int a,int b,int m){

        if(a%m== 0 && b%m == 0) return m;
        else return bekargcd(a,b,b-1);
    }
    public static int gcd(int a,int b){
        int rem = b%a;
        if(rem == 0 ) return a;
        else{
           return gcd(rem,a);
        }

    }
    public static void main(String[] args) {
        int a = 14 ;
        int b = 7;
        int GCD = 0;
//
//        GCD = bekargcd(a,b,Math.min(a,b));
//        System.out.println(GCD);
        GCD = gcd(a, b);
        System.out.println(GCD);
    }
}
