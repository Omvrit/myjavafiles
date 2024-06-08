public class RemovingDuplicatesFromSortedLinkedList {
    public static void removeduplicates(node head){
        node ptr = head;
        node ptr1 = ptr.next;

//        while(ptr.next !=null){
//            if(ptr.next.val == ptr.val){
//                ptr.next = ptr.next.next;
//            }
//            else ptr = ptr.next;
//        }
        while(ptr1 != null){{
            if (ptr1.val != ptr.val) {
                ptr.next = ptr1;
                ptr = ptr1;
            }
            ptr1 = ptr1.next;
        }
        ptr.next = ptr1;



        }
    }
    public static void main(String ...args){
        SLL l = new SLL();
        l.insertAtEnd(10);
        l.insertAtEnd(10);
        l.insertAtEnd(20);
        l.insertAtEnd(20);
        l.insertAtEnd(20);
        l.insertAtEnd(30);
        l.insertAtEnd(40);
        l.insertAtEnd(40);
        l.insertAtEnd(40);
        removeduplicates(l.head);
        l.display(l.head);;

    }

}
