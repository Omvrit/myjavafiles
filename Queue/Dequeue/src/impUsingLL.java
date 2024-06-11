class node{
    int val;
    node next = null;
    node prev = null;

}
class deQueueLL{
    int size = 0;
    node front = null;
    node rear = null;

    void add(int val) {
        node temp = new node();
        temp.val = val;
        if (front == null) {
            front = temp;

        } else {
            temp.prev = rear;
            rear.next = temp;

        }
        rear = temp;
        size++;
    }
    void addLast(int val){
        add(val);
    }
    void addFirst(int val){
        node temp = new node();
        temp.val = val;
        if (front == null) {

            rear = temp;
        }else{
            temp.next = front;
            front.prev  = temp;
        }
        front = temp;
        size++;

    }

    int remove() {
        if(size==0){
            System.out.println("empty queue");
            return -1;
        }
        if(size==1){
            size--;
           return (front.val);
        }
        else{
            int value  = front.val;

            front = front.next;
            front.prev = null;
            size--;
            return value;

        }
    }
    int removeFirst(){
        return remove();
    }
    int removeLast(){
        if(size==0){
            System.out.println("Empty Queue");
            return -1;
        }
        if(size==1){
            size--;
            return front.val;

        }
        else{
            int value  = rear.val;
            rear = rear.prev;
            rear.next = null;
            size--;
            return value;
        }

    }

    void display(){
        node ptr =front;
        if(size==0){
            System.out.print("");
            return;
        }

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
public class impUsingLL {
    public static void main(String[] args) {
        deQueueLL dq = new deQueueLL();
        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);

        dq.remove();
        System.out.println(dq.peek());


        dq.display();
    }
}
