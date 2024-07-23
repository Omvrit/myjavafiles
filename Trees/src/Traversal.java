import java.util.*;

public class Traversal {
    public static void BFS(Tnode root){
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
    public static void inorder(Tnode root){
        if(root == null){
            return;
        }
        inorder(root.l);
        System.out.print(root.val+" ");
        inorder(root.r);

    }
    public static void revinorder(Tnode root){
        if(root == null){
            return;
        }
        revinorder(root.r);
        System.out.print(root.val+" ");
        revinorder(root.l);

    }
    public static void preorder(Tnode root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        preorder(root.l);
        preorder(root.r);

    }
    public static void revpreorder(Tnode root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");

        revpreorder(root.r);
        revpreorder(root.l);

    }
    public static void postorder(Tnode root){
        if(root == null){
            return;
        }

        postorder(root.l);
        postorder(root.r);
        System.out.print(root.val+" ");

    }
    public static void revpostorder(Tnode root){
        if(root == null){
            return;
        }
        revpostorder(root.r);
        revpostorder(root.l);
        System.out.print(root.val+ " ");

    }
    public static void iterativePreorder(Tnode root){
        Stack<Tnode> st = new Stack<>();
        if(root == null){
            System.out.println("[]");
            return ;
        }
        st.push(root);
        while(!st.isEmpty()){
            Tnode temp = st.pop();
            if(temp.r!=null){
                st.push(temp.r);
            }
            if(temp.l!=null){
                st.push(temp.l);
            }
            System.out.print(temp.val+" ");
        }

    }
    public static void iterativePostOrder(Tnode root){
        List<Integer> li = new ArrayList<>();
        Stack<Tnode> st = new Stack<>();
        if(root == null){
            System.out.println("[]");
            return ;
        }
        st.push(root);
        while(!st.isEmpty()){
            Tnode temp = st.pop();

            if(temp.l!=null){
                st.push(temp.l);
            }
            if(temp.r!=null){
                st.push(temp.r);
            }
            li.add(temp.val);

        }
        Collections.reverse(li);
        for (int ele:li
             ) {
            System.out.print(ele+" ");
        }
    }
    public static void iterativeInorder(Tnode root){
        Tnode temp = root;
        Stack<Tnode> st = new Stack<>();
        while(true){
            if(temp!=null){
                st.push(temp);
                temp = temp.l;
            }
            else{
                if(st.isEmpty()) break;
                Tnode node = st.pop();
                System.out.print(node.val+" ");
                temp = node.r;
            }
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
        a.r = c;
        b.l = d;
        b.r = e;
        c.r = f;
        c.l = g;

        inorder(a);
        System.out.println();

        iterativeInorder(a);

    }
}
