
class hi extends Thread{
    @Override
    public void run()  {
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class hello extends Thread{
    public void run(){
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        hi obj1 = new hi();
        hello obj2 = new hello();
        obj1.start();
        Thread.sleep(4000);
        obj2.start();

    }
}
