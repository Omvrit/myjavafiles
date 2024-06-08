public class StringBuilderInJava {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("oM VrIt");
        for(int i =0;i<str.length();i++){
            if((int)str.charAt(i)<92 && (int)str.charAt(i)>=65){
                str.setCharAt(i,(char)((int)str.charAt(i)+32));
            }
            else if((int)str.charAt(i)>96 && (int)str.charAt(i)<124){
                str.setCharAt(i,(char)((int)str.charAt(i)-32));
            }
        }
        System.out.println(str);
    }
}
