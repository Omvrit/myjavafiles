import Node.CreatingNode;
class node{
    int val;
    node next = null;

}
class QueueL{
    int size = 0;
    node front = null;
    node rear = null;

    void add(int val) {
        node temp = new node();
        temp.val = val;
        if (front == null) {
            front = temp;
            rear = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

   int remove() {
        if(front == null){
            System.out.println("empty queue");
            return -1;
        }
        else{
            int value  = front.val;
            front = front.next;
            size--;
            return value;

        }
    }
    void display(){
        node ptr =front;

        while(ptr!=null){
            System.out.print(ptr.val+" ");
            ptr= ptr.next;
        }
    }
    int peek(){
        if(front == null){
            System.out.println("Queue is empty");
            return -1;
        }
        return front.val;
    }
}
public class ImplementationUsingLinkedList {

    public static void main(String[] args) {
        QueueL q = new QueueL();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        System.out.println(q.peek());
        System.out.println(q.size);


        q.display();
    }



}
