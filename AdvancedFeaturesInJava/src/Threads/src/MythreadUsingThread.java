import java.lang.*;
class MyThread extends Thread{
    @Override
    public void run(){
        int[]arr = {1,2,3,4,5,6,7,8,9};
        for(int i = 0 ;i<arr.length;i++){
            arr[i]*=2;
            System.out.println(arr[i]);
            try {
                MyThread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class MythreadUsingThread {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();
        MyThread t2 = new MyThread();
        t2.start();


    }


}
/*But here is a problem ,what if we want to extend another class, so we use Runnable interface
to implement multiple inheritance */
