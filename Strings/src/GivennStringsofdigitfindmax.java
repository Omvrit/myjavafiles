import java.util.*;
public class GivennStringsofdigitfindmax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] Arr = new String[3];
        //one of the approach
//        for(int i =0;i<3;i++){
//            Arr[i]=sc.nextLine();
//        }
//        int sum =0;
//        for(int i =0;i<3;i++){
//            String str= Arr[i];
//            int sum1= 0;
//            for(int j = 0;j<str.length();j++){
//               sum1 = (int) (sum1+((int)(str.charAt(j))-48)*Math.pow(10,str.length()-1-j));
//            }
//            if(sum1>sum) sum = sum1;
//
//
//
//        }
        //another approach
        String sum = "00000000000000000";



        System.out.println("greatest of them all is "+sum);
    }
}
