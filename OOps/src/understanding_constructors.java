class person{
    int age;
    int Class;
    public person(int age, int Class){ // constructor is not used to create the
        //the object just used to assign the values
        this.age = age;
        this.Class = Class;

    }
    public person(int age){

    }

}

public class understanding_constructors {
    public static void main(String[] args) {


        person p = new person(12,9);
        System.out.println(p.age);
    }
}
