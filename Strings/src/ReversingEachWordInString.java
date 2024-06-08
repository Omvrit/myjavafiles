public class ReversingEachWordInString {
    public static void reverse(StringBuilder sb,int i, int j ){
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("My name is paul atredius dune of arrakes");
        StringBuilder sb1 = new StringBuilder(sb.length());
        int i =0,j=0;
        while(j< sb.length()){
            if(sb.charAt(j)==' '){
                reverse(sb,i,j-1);
                i=j+1;
            }
            j++;
        }
        reverse(sb,i,j-1);
        System.out.println(sb);
    }
}
