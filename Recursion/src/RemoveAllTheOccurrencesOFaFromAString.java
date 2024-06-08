public class RemoveAllTheOccurrencesOFaFromAString {
    public static String remove_a(int i,String s,String ans){
        if(i==s.length()) return ans;
        if(s.charAt(i)!='a') ans = ans+s.charAt(i);
        return remove_a(i+1,s,ans);

    }
    public static void main(String[] args) {
        String S = "LaapataLadies";
        String newS = remove_a(0,S,"");
        System.out.println(newS);

    }
}
