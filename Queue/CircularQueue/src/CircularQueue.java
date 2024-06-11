class cqueue
{
    int size = 5;
    int qsize=0;

    int []q = new int[size];
    int front =-1;
    int rear =-1;
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
public class CircularQueue {

    public static void main(String[] args) throws Exception {
        cqueue q = new cqueue();
        q.enqueue(10);

        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
       q.dequeue();
        q.dequeue();
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(50);
        System.out.println(q.qsize);
        System.out.println(q.peek());
        q.display();




    }
}