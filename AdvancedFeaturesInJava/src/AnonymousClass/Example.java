package AnonymousClass;
abstract class OuterClass{
    void Class(){
        System.out.println("OuterClass");
    }
    abstract void bhkk();


}
interface in{
    void yele();
}

public class Example {
    public static void main(String[] args) {
       OuterClass oc1 = new OuterClass(){
           @Override
           void Class(){
               System.out.println("InnerClass");
           }

           @Override
           void bhkk() {

           }
       };
       oc1.Class();

    }
    in i = new in(){

        @Override
        public void yele() {

        }
    };
}
//What is a Anonymous Class?
/*
->A Nested class that does have any name is called a Nested class
-> It can only be made a subclass which extends some class or Abstractness or an interface
-> Only a single object is instantiated  using it
->Used while making comparator and comparable
 */