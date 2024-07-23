public class ImplementRunnableUsingLambda {
    public static void main(String[] args) {
//        //Syntax for anonymous class
//        Runnable t1 = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        };
//        Thread t = new Thread(t1);
//        t.start();


        ///// Syntax for lambda function

        Runnable t1 =()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };
        //here we have basically imagined That it is certain that "This only will be there".
        Thread t = new Thread(t1);
        t.start();



    }
}
//So here we have learned about how we can create a anonymous class using lambda expression
//We can use this method of anonymous class
