class node
{
    int val;
    node next;

}
class stackll{
    node top=null;
    int size = 0;
    public int  push(int ele){
        node temp = new node();
        temp.val = ele;
        temp.next = top;
        top = temp;
        size++;
        return ele;
    }
    public int pop(){
        if(top==null){
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
        int ele = top.val;
        top = top.next;
        size--;
        return ele;
    }
    public int Size(){
        return size;
    }
    public int peek(){
        if(top==null){
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
        return top.val;

    }
    void print(node ptr){
        if(ptr==null){
            return;
        }

        print(ptr.next);
        System.out.print(ptr.val+",");

    }

    void display(){
        if(top==null){
            System.out.println("[ ]");
            return;
        }
        System.out.print("[");
        print(top);
        System.out.println("]");


    }
    public void revdisplay(){
        System.out.print("[");
        node ptr = top;
        while(ptr.next!=null){
            System.out.print(ptr.val+",");
            ptr = ptr.next;
        }
        System.out.print(ptr.val);
        System.out.println("]");

    }


}
public class StackLLimp {
    public static void main(String[] args) {
        stackll st = new stackll();
        System.out.println(st.Size());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        System.out.println(st.Size());
        System.out.println(st.peek());

        st.pop();
        st.pop();st.pop();st.pop();st.pop();st.pop();
        st.display();
        System.out.println(st.Size());




    }
}
