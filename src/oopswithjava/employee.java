package oopswithjava;

public class employee {

    int age ;
    int id;
    String name;

    public employee(String name,int age){
        this.name = name;
        this.age = age;
    }
    public employee(String name,int age,int id){
        this.name = name;
        this.age  = age;
        this.id  = id;
    }
    void displayinfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(this.id);
    }

}
