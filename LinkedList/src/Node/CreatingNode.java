package Node;

public class CreatingNode {

    public static void main(String[] args) {
      node a = new node(23);
        System.out.println(a);
        System.out.println(a.next);

      node b = new node(34);
      a.next = b;
      node c =new node(56);
      b.next = c;
      System.out.println(a.next.val);//value of b.val



    }
}