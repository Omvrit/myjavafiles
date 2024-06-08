public class OperatorPrecedance {
    public static void main(String[] args) {
        System.out.println(7*9/7+7-7);
        System.out.println(7*9/7-7+7);
        int a = 2 ;
        int b = 4;
        int c = 4;
        int d = a / 2 - b / 2;
        int e = b * b / 2 / a - 4 * a * c /2/a;
        int f = a * a - b * b;
        int g = a * b - b;
        System.out.println(e);

}}
