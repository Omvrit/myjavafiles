class queue{
    int size = 20;
    int []q = new int[size];
    int front = -1;
    int rear = -1;
    void enqueue(int val){
        if(rear==size){
            System.out.println("Queue is full");
        }
        else if(front == rear|| front ==-1 || rear == -1 ){
            front = 0;
            rear = 0;
            q[rear++] = val;
        }
        else{
            q[rear++] = val;
        }

    }
    void dequeue(){
        if(front == rear){
            System.out.println("queue is empty");
        }
        else{
            front++;
        }
    }
    int peek(){
        return q[front];
    }
    void display(){
        for(int i =front;i<rear;i++){
            System.out.println(q[i]);
        }
    }
   int size(){
        return rear - front;
    }




}

public class ImplementationUsingArrays {

    public static void main(String[] args) {
        queue q1 = new queue();
        System.out.println(q1.size());
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);


        q1.display();
        System.out.println(q1.size());
        System.out.println(q1.peek());
    }
}