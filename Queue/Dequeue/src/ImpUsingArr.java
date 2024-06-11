class DequeueA{
    int size = 20;
    int []q = new int[size];
    int front = -1;
    int rear = -1;
    void add(int val){
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
    void addLast(int val){
        add(val);
    }
    void addFirst(int val){

    }
    void remove(){
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

public class ImpUsingArr {
    public static void main(String[] args) {





    }
}