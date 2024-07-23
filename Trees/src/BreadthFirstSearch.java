import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    public static void BFSNL(Tnode root) {
        Queue<Tnode> q = new LinkedList<>();
        List<Integer> li = new ArrayList<>();
        if (root == null) {
            return;
        }
        q.add(root);
        while (!q.isEmpty()) {
            int t = q.size();
            li.add(q.peek().val);

            while (t > 0) {
                assert q.peek() != null;
                if (q.peek().l != null)
                    q.add(q.peek().l);
                if (q.peek().r != null)
                    q.add(q.peek().r);
                System.out.print(q.remove().val+" ");
                t--;
            }
            System.out.println();


        }
        System.out.println(li);
    }
    public static void BFS(Tnode root){
        if(root == null){
            return;
        }
        Queue<Tnode> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            if(q.peek().l!=null){
                q.add(q.peek().l);
            }
            if(q.peek().r!=null){
                q.add(q.peek().r);
            }
            System.out.print(q.peek().val+" ");
            q.remove();

        }
    }
    public static void revatlevBFS(Tnode root){
        if(root == null){
            return;
        }
        Queue<Tnode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            if(q.peek().r!=null){
                q.add(q.peek().r);
            }
            if(q.peek().l!=null){
                q.add(q.peek().l);
            }

            System.out.print(q.peek().val+" ");
            q.remove();

        }
    }
    public static void revBFS(Tnode root){
        if(root == null){
            return;
        }
        Queue<Tnode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            if(q.peek().r!=null){
                q.add(q.peek().r);
            }
            if(q.peek().l!=null){
                q.add(q.peek().l);
            }

            System.out.print(q.peek().val+" ");
            q.remove();

        }
    }

    public static void main(String[] args) {
        Tnode a = new Tnode(1);
        Tnode b = new Tnode(2);
        Tnode c = new Tnode(3);
        Tnode d = new Tnode(4);
        Tnode e = new Tnode(5);
        Tnode f = new Tnode(6);
        Tnode g = new Tnode(7);

        a.l = b;
//        a.r = c;
//        b.l = d;
//        b.r = e;
//        c.l = f;
//        c.r = g;
//        BFS(a);
//        System.out.println();
//        revatlevBFS(a);
        BFSNL(a);
    }
}
