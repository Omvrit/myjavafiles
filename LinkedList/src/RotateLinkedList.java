import Node.node;

public class RotateLinkedList {
    public static node RotateLList(node head, int k ){

         node dummy = head;
         node fp = head;
         node sp = head;
         int size = 0;
         while(fp!=null){
             fp = fp.next;
             size++;
         }
         fp = head;
         k = k%size;

        for (int i = 1 ; i <=k; i++) {
            fp=fp.next;
            if(fp == null ){
                fp = head;
            }
        }

        if(fp == null || fp == sp){
            return head;
        }
        while(fp.next!=null){
            sp = sp.next;
            fp = fp.next;
        }
        head = sp.next;
        sp.next = null;
        fp.next = dummy;
        return head;

    }

    public static void main(String[] args) {
        SLL l = new SLL();
        l.insertAtEnd(10);
        l.insertAtEnd(20);
        l.insertAtEnd(30);
        l.insertAtEnd(40);
        l.insertAtEnd(50);
        l.insertAtEnd(60);
        l.insertAtEnd(70);
        int k = 9;
        

        l.display(RotateLList(l.head,k));
    }
}
