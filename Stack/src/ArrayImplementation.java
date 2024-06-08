
class Stack {


    int size;
    int[] stack ;



    int top = -1;
    public Stack(int size){
        this.size = size;
        this.stack = new int[this.size];


    }
    public void Size(){
        System.out.println(top+1);
    }




    public void push(int ele){
        if(top==size-1) {
            System.out.println("Stack overflow");
            return ;

        }


        top++;
        stack[top] = ele;






    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return;
        }
        top--;
    }
    public void peek(){

      if(top==-1) {System.out.println("NULL");return ;}
      System.out.println(stack[top]);

    }
    public void display(){
        if(top == -1){
            System.out.println("[]");
            return;
        }
        System.out.print('[');
        for(int i =0 ;i<=top-1;i++){
            System.out.print(stack[i]+",");
        }
        System.out.print(stack[top]);

        System.out.println(']');
    }
    public boolean isEmpty(){
        return top == -1;
    }

        }
public class ArrayImplementation {
    public static void main(String[] args) {
        Stack ST = new Stack(5);
        System.out.println(ST.isEmpty());
        ST.pop();
        ST.peek();
        ST.push(10);
        System.out.println(ST.isEmpty());
        ST.push(20);
        ST.push(30);
        ST.push(40);
        ST.push(50);
        ST.pop();
        ST.pop();
        ST.pop();

        ST.pop();

        ST.pop();
        ST.pop();


        ST.Size();

        ST.display();




    }

}
