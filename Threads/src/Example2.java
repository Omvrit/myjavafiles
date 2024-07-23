class hii implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class helloo implements Runnable {
    @Override
    public void run(){
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Helloo");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Example2 {
    public static void main(String[] args) {
        Runnable obj1 = new hii();
        Runnable obj2 = new helloo();
        obj1.run();
        obj2.run();
    }
}
