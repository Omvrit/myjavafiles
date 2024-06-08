public class PowerofAoverB {
    public static long  pow(long a,long b){
        long ans =0;
        if(b==0) return 1;

        else{
            ans = pow(a,b/2);

        }
        if(b%2==0){
            return ans *ans;
        }
        else return ans * ans *a;
        }


    public static void main(String[] args) {
        long a =2;
        long b =60;
        System.out.println(pow(a,b));
    }
}
