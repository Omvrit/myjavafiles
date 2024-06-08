interface My_Interface{
    public static final int  a = 0;
    public void name();



}
interface My_Interface1 extends My_Interface{

    public void Class();



}
class PPerson implements My_Interface1{
    @Override
     public void name(){
        System.out.println("adknjknajksnd");
    }
    @Override
    public void Class(){
        System.out.println("IN CLASS 3B");
    }

}

public class Interface {
    public static void main(String[] args) {
    PPerson p1 = new PPerson();
    p1.name();
//    p1.Class();
        int a = 10000000;
        long v = (int)a;
        long x = Long.MAX_VALUE;
        System.out.println(x);
        int m = (int) x;
        System.out.println(m);

    }
}
