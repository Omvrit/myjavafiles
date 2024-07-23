public class LearningNestedClass {
    static class toy{
        int price;
    }
    public static void main(String[] args) {
        toy t1 = new toy();
        t1.price= 0;
    }
}
//What is a nested static class?
/*
static inner class don't need to create an object of outer class
*/