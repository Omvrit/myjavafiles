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
        // obj1.run()
        // obj2.run();
        //This will Simply run the .run method form the class
        //So to start this thread we first need to make a Thread and then pass the runnable in that Thread as parameter
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread (obj2);
        t1.start();
        t2.start();
    }
}
