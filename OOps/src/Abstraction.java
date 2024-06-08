import java.util.Scanner;
abstract class MyAbsractClass {
   public  int a = 10;

    public void Printclass(){
        System.out.println("Abstract");
    }
    abstract public void printname() ;
    abstract public int add();
}
class male extends MyAbsractClass{

    String name;

//    public void Printclass(){
//        System.out.println("Male Class");
//    }
    public void printclass(){
        super.Printclass();
        System.out.println("Male Class");
    }
    public int add(){
        return 2+3;
    }
   public male(String name){
       this.name = name;
   }
    public void printname() {
        System.out.println("yuikhukh");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        male m1=  new male("kukhuu");
        m1.printclass();
        m1.printname();
        System.out.println(m1.add());
    }
}
