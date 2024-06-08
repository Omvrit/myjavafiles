public class practice_sheet {
    public static void main(String[] args) {
      /*  int i,j;
        for(i=4;i>=0;i--){
            for(j=0;j<i;j++){
                System.out.printf("*");
            }
            System.out.print("\n");
        }*/
        //sum of first n even numbers using while loop
      /*  int n= 10;
        int sum = 0;

        int m=1;
        while(m<=n){

            sum = sum + 2 * m;
           m=m+1;

        }
        System.out.println("sum is "+sum);
    //multiplication table of any number n
        int table =91;
        int i;
        for(i=1;i<=10;i++){
            System.out.println(table*i);
        }*/


    //factorial of given number n
        int n=5;
        int fact = 1;
        for(int i =n;i>0;i--){
            fact = fact*i;
        }
        System.out.println("factorial of  5is "+fact);
    }
}
