

public class UseOfJoin {
    public static void main(String[] args) {
       Runnable Hello = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
            };
        };
        Runnable Hi= ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi");
            };
        };
        Thread t1 = new Thread(Hello);
        Thread t2 = new Thread(Hi);
//        t1.start();
//        t2.start();
//        System.out.println("Bye");
        /* When we run above 3 lines code we will find that we got Bye between "Hello" and "Hii" somewhere
        so inorder to prevent this we use join() function
        ->now what join function does is it makes the current thread wait until the thread on which it is called is dead */
        t1.start();
        t2.start();
        System.out.println(t1.isAlive());
        try {
            t1.join();
            t2.join();
        }

        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(t1.isAlive());

        System.out.println("Bye");
        /* So now when we run ,it is taken care that "main" Thread waits till other thread gets executed*/
    }

}
