public class MazePath {
    public static int mazeGoAhead(int m,int n ){
        if(m==1 || n==1) return 1;

        else return mazeGoAhead(m-1,n)+mazeGoAhead(m,n-1);
    }
    public static void main(String[] args) {
        System.out.println(mazeGoAhead(4,4));
    }
}
