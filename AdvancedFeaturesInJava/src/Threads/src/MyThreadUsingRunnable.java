class A{

}
class RunnableThread implements Runnable {
    int n ;

    public RunnableThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
            System.out.println(arr[i]);
            try {
                MyThread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    static void start(Runnable r){
        r.run();
    }
}
public class MyThreadUsingRunnable {
    public static void main(String[] args) {
        RunnableThread t1 = new RunnableThread(1);
        RunnableThread t2 = new RunnableThread(1);
        //This below here Thread making is important for Runnable implemented Thread to get the it started
        //Because if we use .run it will simply do run the run method from the class
        Thread t3 = new Thread(t1);
        Thread t4= new Thread(t2);
        t3.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
        t4.start();



    }
}

/*Runnable interface is function interface:
A functional interface is that particular interface that have only one abstract method(only one method-> "void run")*/
/*Also we don't have any start method inside the runnable like we have in thread class*/