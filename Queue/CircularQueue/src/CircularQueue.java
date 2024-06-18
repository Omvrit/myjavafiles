class cqueue
{
    int size =0;
    int qsize=0;


    int front =-1;
    int rear =-1;
    cqueue(int k){
        this.size  = k;
        int []q = new int[k];

    }
    int []q = new int[size];
    void enqueue(int val) throws Exception {
        if(qsize==size){
            throw new Exception("Queue is full");
        }
        else if(qsize==0){
            front = 0;
            rear = 0;
            q[(rear)] = val;
            qsize++;
        }
        else{
            rear = (rear+1)%size;
            q[rear] = val;
            qsize++;
        }
    }
    void dequeue()throws Exception{
        if(qsize==0){
            throw new Exception("Queue is empty");
        }
        else if(front == rear){
            front = -1;
            rear =-1;
            qsize--;
        }
        else{
            front=(front+1)%size;
            qsize--;
        }
    }
    int peek() throws Exception {
        if(size!=0)
        return q[front];
        else{
            throw new Exception("Queue is empty");
        }

    }
    void display(){
        if(size==0){
            System.out.println("");
            return;
        }
        int i =0;
        for( i =front;i!=rear;i=(i+1)%size){
            System.out.print(q[i]+" ");
        }
        System.out.print(q[i]);
    }
}
class node{
    int val;
    node next = null;

}
class Cqueuell{
    int size = 0;
    node front = null;
    node rear = null;


    void enqueue(int val) {
        node temp = new node();
        temp.val = val;

        if (size==0) {
            front = temp;
            rear = temp;

        } else {
            rear.next = temp;
            rear = temp;

        }
        rear.next = front;
        size++;
    }

    int dequeue() throws Exception {

        if(size==0){
            throw new Exception("Queue is Empty");
        }
        else if(size==1){
            int x  = front.val;
            front = null;
            rear = null;
            size--;
            return x;
        }
        else{
            int value  = front.val;
            front = front.next;
            rear.next = front;
            size--;
            if(size==1){
                return value;
            }

            return value;

        }
    }
    void display(){
        if(size==0){
            System.out.println();
            return;
        }
        node ptr =front;
        System.out.print(ptr.val+" ");
        ptr = ptr.next;

        while(ptr!=front){
            System.out.print(ptr.val+" ");
            ptr= ptr.next;
        }
        System.out.println();
    }
    int peek(){
        if(front == null){
            System.out.println("Queue is empty");
            return -1;
        }
        return front.val;
    }
}
public class CircularQueue {
    public static void main(String[] args) throws Exception {
//        Cqueuell q = new Cqueuell();
//        q.enqueue(10);
////        q.enqueue(20);
////        q.enqueue(30);
////        q.enqueue(40);
////        q.enqueue(50);
////        q.enqueue(60);
//        q.display();
//        q.dequeue();
////        q.enqueue(40);
//        q.display();
//        q.dequeue();
//        System.out.println(q.size);
        cqueue q = new cqueue(5);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.dequeue();
        q.display();










    }
}