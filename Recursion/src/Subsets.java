public class Subsets {
    public static void printSubsets(String s,String res,int n){

        if(n==s.length()) {System.out.println("{"+res+"}");return;}

        printSubsets(s,res+s.charAt(n),n+1);
        printSubsets(s,res,n+1);


    }
    public static void main(String[] args) {
        String s = "abb";

        printSubsets(s,"",0);
    }
}
