class Parent{
   private int c=  10;
   public void getC(){
       System.out.println(this.c);
   }
     public void  show(){
        System.out.println("Parent huun");
    }
}
class Child extends Parent{
     public void  show(){
        System.out.println("Child huun");
    }
   
}
public class Main {

    public static void main(String[] args){
        Parent p1 = new Parent();
        Child c1= new Child();
        p1.show();
        c1.show();
        p1.getC();


    }
}