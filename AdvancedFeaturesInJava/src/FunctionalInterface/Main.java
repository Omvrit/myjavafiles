package FunctionalInterface;

//2 functional interface
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
        //3 lambda expression.
        Square s1 = (int t)->{

            return t;
        };

        }
    }

//1-What are anonymous classes?
/* Ans -> Anonymous classes in Java provide a concise way to define and instantiate classes that
are used only once and where naming them would not add value. They are particularly useful
in scenarios like event handling, quick interface implementations, or where small,
encapsulated pieces of functionality are needed.
 */
//2-What Are functional interfaces?
/*
Ans-> A functional interface is interface which have only one abstract method.
It allows us to use lambda expressions.
 */
//3-What are lambda expression?
/*
Lambda expressions are way to create an implementation of functional interface by reduce the
code written to make them
It can only be implemented for functional interfaces(due to their property of having only one abstract method)
multiple ways-:
1->(int x)->{return x};
2->(x)->2*x;
3->x->2*x;
4->(int x,int y)->{ return x+y};
5->(x,y)->x+y;



 */

