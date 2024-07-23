package Questions;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class ElementsOfNthLevel {
    public static void nthLevelElement(Tnode root,int n){
        if(root == null){
            return ;
        }
        Queue<Tnode> q = new LinkedList<>();
        int level = 0;

        q.add(root);
        while(level<n){

            int t = q.size();

            while(t>0){
                assert q.peek() != null;
                if(q.peek().l!=null){
                    q.add(q.peek().l);
                }
                if(q.peek().r!=null){
                q.add(q.peek().r);
                    }

                q.remove();
                t--;
            }
            level++;
        }


        if(q.isEmpty()){
            System.out.println("Not possible");
            return;
        }
        while(!q.isEmpty()){
            System.out.print(q.remove().val+" ");
        }

    }
    public static void preOrder(Tnode root,int level,int n){
        if(root!=null){
            if(level == n ){
                System.out.println(root.val);
            }
            preOrder(root.l,level+1,n);
            preOrder(root.r,level+1,n);
        }
    }
    public static void nthLevelElementUsingPreOrder(Tnode root,int level){

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
        c.l = f;
        c.r = g;
        int level = 0;

        nthLevelElement(a,2);
//        preOrder(a,0,2);
    }
}
