import java.util.Arrays;

public class ValidAnignaleetcode242 {
    public static void main(String[] args) {
        String s = "ab";
        String t = "bae";

        int maxindex =0;
        int flag =1;
        int ssize = s.length();
        int tsize = t.length();
        int []sarray = new int[26];
        int []tarray = new int[26];
        for(int i = 0 ; i<ssize ; i++){
            sarray[(int)(s.charAt(i))-97]+=1;
            maxindex = (int)(s.charAt(i))-97;

        }
        for(int i = 0 ; i<tsize ; i++){
            tarray[(int)(t.charAt(i))-97]++;
            if((int)(t.charAt(i))-97>maxindex) maxindex = (int)(t.charAt(i))-97;
        }
        System.out.println(Arrays.toString(sarray));
        System.out.println(Arrays.toString(tarray));

        int max = maxindex;
        System.out.println(max);
        for(int i =0;i<max;i++){
            if(sarray[i]!=tarray[i]){ flag = 0;
            break;}
        }
        if(flag == 0){
            System.out.println(false);
        }
        else System.out.println(true);

    }



}
