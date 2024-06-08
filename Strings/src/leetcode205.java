import java.util.Arrays;
//not right

public class leetcode205 {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        int len = s.length();
        int [] dataarray = new int [26];
        for (int i = 0; i < 26; i++) {
            System.out.print(dataarray[i] + " ");
        }
        dataarray[(int)(s.charAt(0))-97] =(t.charAt(0)) ;
        for(int i =1;i<len;i++){
            if(dataarray[(int)(s.charAt(i))-97]==0){
                dataarray[(int)(s.charAt(i))-97] =(t.charAt(i)) ;
            }
            else{
                if(dataarray[(int)(s.charAt(i))-97] != (t.charAt(i)));

            }
        }




    }
    }
