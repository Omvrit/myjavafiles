//class MyThread extends Thread{
//    String name;
//    public MyThread(String name){
//        super();
//        this.name = name;
//    }
//    @Override
//    public void run()
//    {
//        for (int i = 0; i < 100; i++)
//        {
//            System.out.println(this.name+" is executed "+(i+1));
//            try
//            {
//                Thread.sleep(100);
//            }
//            catch (InterruptedException e)
//            {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
class MyThread implements Runnable{
    String name;
    public MyThread(String name){
        super();
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            System.out.println(this.name+" is executed "+(i+1));
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
    Thread th = new Thread(new MyThread("RED"));
    Thread th1 = new Thread(new MyThread("Yellow"));
    Thread th2 = new Thread(new MyThread("Green"));
    th.start();
    th1.start();
    th2.start();
    System.out.println("AdwadmkmlwdaaawdawddwadAdawdawdwDwADWADADASDSADWADAWAWDWADWAD");
    }
}
//which is better
//Runnable interface because using this we can extend more than two class as well as implements
//Runnable interface