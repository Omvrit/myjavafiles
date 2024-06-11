import Node.node;

class SLL{//singly linked list
    node head;
    node tail;
    int size;

    void insertAtEnd(int data){
        node temp = new node(data);
        if(head==null) head=tail=temp;//if linked list empty
        else {
            tail.next = temp;
            tail=temp;
        }
        size++;
    }
    void display(node head){
        this.head = head;
        node ptr = this.head;
        while(ptr!=null){
            System.out.print(ptr.val+"->");
            ptr=ptr.next;
        }

        System.out.println("null");
    }
    int getElement(int index)throws Exception{
        if(index>=size || index<0) {
            throw new Exception("Invalid index");


        }
        else if(index == 0){
            return(head.val);
        }
        else if(index == size-1){
            return(tail.val);
        }
        else{
        node ptr =head;
        int i =0;
        while(i<index){
            i++;
            ptr=ptr.next;
        }
        return(ptr.val);
    }}
    void insertAtBeginning(int data){
        node temp = new node(data);
        if(head==null){
            head = tail = temp;
        }
        else {
            temp.next = head;
            head = temp;

        }
        size++;
    }
    void insertAtIndex(int index,int data){

        if(index == 0){
           insertAtBeginning(data);
           return;
        }
        else if(index==size ){ insertAtEnd(data);
            return;}
        else if(index > size|| index<0) {
            System.out.println("invalid index");
            return;
            }
        else {
            node ptr = head;
            node temp = new node(data);
            int i = 0;
            while (i < index - 1) {
                i++;
                ptr = ptr.next;
            }
            temp.next = ptr.next;
            ptr.next = temp;
        }
        size++;
    }
    void setElement(int index,int data)throws Exception{
        node ptr = this.head;
        if(index>=size || index<0) {
            throw new Exception("Invalid index");
        }

        if(index==size-1){
            tail.val=data;
        }
        else {
            int i = 0;
            while (i < index) {
                i++;
                ptr = ptr.next;
            }
            ptr.val = data;
        }
    }
    void deleteNodeAtEnd(){
        if(head==null) {System.out.println("LinkedList is empty");
        return;};

        node ptr = head;
        while(ptr.next.next!=null){ ptr = ptr.next;}
        tail = ptr;
        ptr.next = null;
        size--;
    }
    void deleteNodeAtStart(){
        if(head==null){System.out.println("LinkedList is empty");
            return;}
        head = head.next;
        size--;

    }
    void deleteAtIndex(int index){
        node ptr = head;
       if(head == null) {System.out.println("LinkedList is empty");return;}
       if(index == 0){
            deleteNodeAtStart();
            return;
       }
       if(index==size-1){
           deleteNodeAtEnd();
           return;
       }
       else{
        int i =0;
        while(i<index-1){
            i++;
            ptr=ptr.next;
        }
        ptr.next = ptr.next.next;

    }
    size--;
    }
}
public class LinkedListImplementation {
    public static void main(String[] args) throws Exception {
        SLL l = new SLL();
        l.insertAtEnd(10);
        l.insertAtEnd(20);
        l.insertAtEnd(30);
        l.insertAtEnd(40);
        l.insertAtEnd(50);
        


    }
}
