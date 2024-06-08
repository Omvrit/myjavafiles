public class PrintAllThePermutaion {
    public static void Printp(String s,String s1){

        if(s.isEmpty()){
            System.out.println(s1);
            return;
        }
        else{
            for(int x= 0 ;x<s.length();x++){
                Printp(s.substring(0,x)+s.substring(x+1),s1+s.charAt(x));

            }
        }
    }
    public static void main(String[] args) {
        String s = "abcdefghij";
        Printp(s,"");
    }
}
