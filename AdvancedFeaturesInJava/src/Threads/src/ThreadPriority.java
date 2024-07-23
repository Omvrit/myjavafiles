
public class ThreadPriority {
    public static void main(String[] args) {


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                System.out.println("Create ");
            }
        });
        t1.setName("Create");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                System.out.println("Running");
            }
        });
        t2.setName("Running");
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                System.out.println("Stop ");
            }
        });
        t3.setName("stop");
        /*This is how we set name*/
//        System.out.println(t2.getName());
//        System.out.println(t1.getName());
//        System.out.println(t3.getName());
        /*This is how we get the name*/
        //-> It can range between 1--10
        //MAX_PRIORITY -> 10
        //NORM_PRIORITY -> 5
        //MIN_PRIORITY -> 1
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//        System.out.println(t3.getPriority());
       /*This is how we set Priority*/
        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(3);


//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//        System.out.println(t3.getPriority());

        t1.start();
        t2.start();
        t3.start();
    }
}
/*  it's important to note that thread priority only hints at the underlying
operating system scheduler and may not always result in the expected execution order.
The actual behavior depends on various factors, including the operating system and the system's workload
 */