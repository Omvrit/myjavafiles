import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        char [] ch = str.toCharArray();
        Arrays.sort(ch);
        str = Arrays.toString(ch);
        System.out.println(str);
    }
}
