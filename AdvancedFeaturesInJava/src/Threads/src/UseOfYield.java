public class UseOfYield {
    public static void main(String[] args) {
        Runnable Hello = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
                Thread.yield();
            }
        };
        Runnable Hi= ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi");
            }
        };
        Thread t1 = new Thread(Hello);
        Thread t2= new Thread(Hi);
        t1.start();
        t2.start();


    }
}
//what does it do?
/*
In Java, the yield keyword is used in the context of thread
execution to indicate that the current thread is willing to
yield its current use of the CPU. However, it's important to
note that the yield keyword does not guarantee that the thread
will yield the CPU; it merely suggests to the scheduler that the
thread is willing to give up its current use.
 */