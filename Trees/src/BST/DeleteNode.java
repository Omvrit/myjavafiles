package BST;

import com.sun.source.tree.Tree;

class TreeNode {
   int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class DeleteNode {
    public static void del(TreeNode root,TreeNode prev,int key){
        if(root == null){
            return;
        }

        if(root.left!=null && root.left.val == key){
            TreeNode tem = root.left;
            if(tem.left==null && tem.right==null){
                root.left = null;
            }
            if(tem.left == null){
                root.left = tem.right;
            }
            if(tem.right == null){
                root.left = tem.left;
            }
        }
        if(root.right!=null && root.right.val == key){
            TreeNode tem = root.right;
            if(tem.left==null && tem.right==null){
                root.right = null;
            }
            if(tem.left == null){
                root.right= tem.right;
            }
            if(tem.right == null){
                root.right = tem.left;
            }

        }

        del(root.left,prev.left,key);
        del(root.right,prev.right,key);

    }
    public static void deleteNode(TreeNode root, int key) {
        TreeNode dummy = new TreeNode(-1);
        TreeNode prev = dummy;
        dummy.left=root;
        dummy.right=root;

    }

    public static void main(String[] args) {


        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(20);
        TreeNode c = new TreeNode(30);
        TreeNode d = new TreeNode(40);
        TreeNode e = new TreeNode(50);
        TreeNode f = new TreeNode(60);
        TreeNode g = new TreeNode(70);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = d;
        int key=70;



    }
}
