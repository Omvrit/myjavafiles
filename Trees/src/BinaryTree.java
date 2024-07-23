public class BinaryTree {
    public static void display(Tnode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        display(root.l);
        display(root.r);

    }
    public static int sum(Tnode root){
        if(root == null){
            return 0;
        }

        return root.val+sum(root.l)+sum(root.r);



    }
    public static int product(Tnode root){
        if(root == null){
            return 1;
        }

        return root.val*product(root.l)*product(root.r);



    }
    public static int size(Tnode root){
        if(root == null){
            return 0;
        }

        return size(root.l)+size(root.r)+1;



    }
    public static int max(Tnode root){
        if(root == null ){
            return Integer.MIN_VALUE;}

        return Math.max(Math.max(max(root.l),max(root.r)),root.val);
    }
    public static int min(Tnode root){
        if(root == null ){
            return Integer.MAX_VALUE;}

        return Math.min(Math.min(min(root.l),min(root.r)),root.val);
    }
    public static void main(String[] args) {

        Tnode a = new Tnode(1);
        Tnode b = new Tnode(7);
        Tnode c = new Tnode(5);
        Tnode d = new Tnode(8);
        Tnode e = new Tnode(10);
        Tnode f = new Tnode(2);
        Tnode m = new Tnode(5);

        a.l = b;
        a.r = c;
        b.l = d;
        b.r = e;
        c.r = f;
        c.l = m;
        display(a);
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(productNonZero(a));
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(size(a));
        System.out.println(level(a));




    }

    private static int productNonZero(Tnode root) {
        if(root == null || root.val == 0){
            return 1;
        }

        return root.val*productNonZero(root.l)*productNonZero(root.r);


    }
    public static int level(Tnode root){
         if(root == null){
             return 0;
         }
         return 1+Math.max(level(root.l),level(root.r));
    }

}
