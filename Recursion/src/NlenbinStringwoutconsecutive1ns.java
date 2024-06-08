public class NlenbinStringwoutconsecutive1ns {
    public static void doPrint(int n,String s){


        if(s.length()==n){ System.out.println(s);
        return;}
        
        else{
            if(!s.isEmpty()){
                if(s.charAt(s.length()-1)=='1'){

                    doPrint(n,s+0);
                }
                else{
                    doPrint(n,s+0);
                    doPrint(n,s+1);}

                }

            else{

            doPrint(n,s+0);
            doPrint(n,s+1);}
        }
    }
    public static void main(String ...arr){
        int n = 1;

        doPrint(n,"");


    }

}
