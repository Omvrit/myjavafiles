public class JAVAMETHODS {
    // using static
    static int add(int a, int b){


        return a+b;
    }
    //this was using an object associated with class
    int add1(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int b1=5;
        System.out.println(add(a,b));
        JAVAMETHODS obj =new JAVAMETHODS();//while this we created an object associated with our JAVAMETHODSCLASS
        int c=obj.add1(a,b1);
        System.out.println(c);
    }
}
