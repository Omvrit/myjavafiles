
class node{
    String url;
    node next = null;
    node prev = null;

}
class BrowserHistory {
    node head = null;
    node top = null;
    static node curr_ptr = null;

    public BrowserHistory(String homepage) {

        node temp = new node();
        temp.url = homepage;
        head = temp;
        top =temp;
        curr_ptr = temp;

    }

    public void visit(String url) {
        node temp = new node();
        temp.url = url;
        temp.prev = top;
        top.next = temp;
        top = temp;
        curr_ptr = temp;

    }

    public String back(int steps) {
        int i = 0;

        while(curr_ptr.prev != null&& i<steps){
            curr_ptr = curr_ptr.prev;
            i++;
        }
        return curr_ptr.url;

    }

    public String forward(int steps) {
        int i = 0;

        while(curr_ptr.next!=null && i<steps){
            curr_ptr = curr_ptr.next;
            i++;
        }
        return curr_ptr.url;
    }
    public void display(){
        node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.url+" ");
            ptr = ptr.next;
        }
    }
}
public class Main {
    public static void main(String[] args) {
       BrowserHistory br = new BrowserHistory("Leetcode.com");
       br.visit("google.com");
       br.visit("facebook.com");
       br.visit("youtube.com");
        System.out.println(br.back(1));
        System.out.println(br.back(1));
        System.out.println(br.forward(1));
      br.visit("linkedin");
      System.out.println(br.forward(1));
        System.out.println(br.back(2));
        System.out.println(br.back(7));
        br.display();




    }
}