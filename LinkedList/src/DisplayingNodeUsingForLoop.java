import Node.node;

public class DisplayingNodeUsingForLoop {
    //done recursively
    public static void print(node head){
        if(head == null) return;
        System.out.println(head.val);
        print(head.next);


//
//        while(temp!=null){
//            System.out.println(temp.val);
//            temp = temp.next;
//        }
    }
    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);
        node f = new node(60);
        a.next = b;
        b.next =c;
        c.next = d;
        d.next = e;
        e.next = f;
        node head = a;

        print(head);


    }
}
