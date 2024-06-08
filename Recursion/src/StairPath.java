public class StairPath {
    public static int totalSteps(long n){
        if(n==0){
            return 1;
        }
        if(n<0) return 0 ;

        else return totalSteps(n-1)+totalSteps(n-2);
    }
    public static void main(String[] args) {
        long n =10;
        System.out.println(totalSteps(n));
    }
}