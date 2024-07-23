public class LearningInnerClass {
    class Toy{
        int price ;
    }
    public static void main(String[] args) {
       Toy t1 = new LearningInnerClass().new Toy();
       t1.price =10;
        System.out.println(t1.price);

    }
}
//inner class?
/*
it is a class defined inside a class so inorder to make the object of
inner class we need to create an object of outer class
*/