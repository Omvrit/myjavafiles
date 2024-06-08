import java.util.Arrays;

public class Leetcode443 {
    public static void main(String[] args) {
        char [] arr = {'a','b','b','b','b','b','b','b','b','b','b','c','c','d'} ;
        int len =  arr.length;

        int index = 0;
        for(int i =0;i<len;){
            char a = arr[i];
            arr[index]=a;
            i++;

            index++;
            int count=1;
            //this is for checking frequency
            while(i<len && arr[i] == a){
                count++;
                i++;
            }

            //this is for adding frequency to char array
            if(count>1) {

                if (count < 10) {

                    arr[index] = (char) ((count % 10) + 48);

                    index++;

                } else {
                    int digit = 0;
                    int c = count;
                    while (c > 0) {
                        digit++;
                        c = c / 10;
                    }
                    int real = index + digit;
                    while (count > 0) {
                        arr[index + digit-1] = (char) ((count % 10) + 48);
                        digit--;

                        count = count / 10;
                    }
                    index = real;


                }

            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println((index));
    }
}
