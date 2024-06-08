import java.util.Arrays;

public class GivenAStringPrintCharacterComingMostNumberOfTimes {
    public static void main(String[] args) {


        String Str= "physicswallah";
        int len = Str.length();
        int [] cA = new int[len];
        char mo = Str.charAt(0);

        char []ch =Str.toCharArray();


        int  i ;
        Arrays.sort(ch);
        System.out.println(
                Arrays.toString(ch)
        );
        int count1 = 0;
        int count2= 0;
        char current = ch[0];
        for(i =0;i<len;i++){
            if(ch[i]==current){
                count2++;
            }
            else{

                if(count2>=count1){
                    count1 = count2;
                    mo = current;
                }
                current = ch[i];
                count2 = 1;
            }

        }

        if(count2>=count1){

            mo = current;
        }
        System.out.println("Most occured in "+Str+" is "+mo);



    }
}
