import java.util.ArrayList;
import java.util.List;

public class Generate_Paranthesis {
    public static boolean opengrclose(String str,int n,int strlen){
        int cC = 0;
        int cO = 0;
        for(int i =0 ;i<strlen;i++){
            if(str.charAt(i)=='(') cO++;
            else cC++;
        }
        if(cO>=cC && cO<=n) return true;
        else return false;
    }
    public static void doParan(List<String>l,int n,String str,int strlen){

        if(strlen==2*n){
            if(opengrclose(str,n,strlen))
                l.add(str);

            return;
        }
        else{
            if(opengrclose(str,n,strlen)){
                doParan(l,n,str+')',strlen+1);
                doParan(l,n,str+'(',strlen+1);
            }
            else return;

        }

    }

    public static void main(String[] args) {


        List<String> l = new ArrayList<>();
        int n =3;

        doParan(l,n,"",0);
        System.out.println(l);

    }
}
