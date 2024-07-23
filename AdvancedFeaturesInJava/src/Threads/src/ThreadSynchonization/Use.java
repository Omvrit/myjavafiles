package ThreadSynchonization;
class Counter{
    int count;
    public synchronized void increment(){
        this.count++;
    }
}
public class Use {

    public static void main(String[] args) {
        Counter c = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception _){

        }


        System.out.println("count "+c.count);

    }
//}
/*Here we can see That counter is accessed by Threads simultaneously that result in Unwanted result
And this is know a problem of synchronization it should have resulted 2000 but it does not
*/
    /*To solve this we use synchronized methods (Resources) that means when we use one resource
    other thread must not use that same resource hence mutual exclusion is achieved and we made it thread safe
     */
    //here we used synchronized incrementer
    /* we can also use synchronized block*/


}
