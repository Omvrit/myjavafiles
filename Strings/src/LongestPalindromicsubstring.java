public class LongestPalindromicsubstring {
    public static int palindrome(String s,int size){
        for(int m =0;m<(size)/2;m++){
            if(s.charAt(m) != s.charAt(size - 1 - m)) {
                return 0;

            }
        }
        return 1;
    }
    public static String longestPalindrome(String s) {
        int i  =s.length();
        String res="";

        return res;}

        public static void main(String[] args) {
        String s  = "babad";
            System.out.println(longestPalindrome(s));


    }
}
