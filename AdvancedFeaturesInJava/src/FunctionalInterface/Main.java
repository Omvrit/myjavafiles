package FunctionalInterface;


interface Square{
    int square(int a);
}
class Main{
    public static void main(String[] args) {
//        1-This is what it is called anonymous class
         Square s = new Square(){
             @Override
             public int square(int x) {
                 return x*x;
             }
         };
         Square a = (int x)->2*2;

        System.out.println(s.square(12));

        System.out.println(a.square(34));

        }
    }
//1-What are anonymous classes?
/* Ans -> Anonymous classes in Java provide a concise way to define and instantiate classes that
are used only once and where naming them would not add value. They are particularly useful
in scenarios like event handling, quick interface implementations, or where small,
encapsulated pieces of functionality are needed.
 */
//2-What Are lambda expressions?
