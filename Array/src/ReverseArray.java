import org.jetbrains.annotations.NotNull;

import java.util.Arrays;


public class ReverseArray {
    public static void rotateArray(int []a,int k){
        int n = a.length;
        int []temp = new int[n];
        if(k>n){
            k=k%n;
        }

        int max=(k+1)/2;


        for(int i=0;i<(n-k)/2;i++){
            int te = a[i];
            a[i]=a[(n-k-1-i)];
            a[(n-k-1-i)]=te;
        }
//        max = ((n-k)/2);
        int i=n-k;
        for(int j=0;j<k/2;j++){
           int te = a[i];
           a[i] = a[n-1-j];
              a[n-1-j]=te;
                i++;
        }
        for(i=0;i<n/2;i++){
            int te = a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=te;
        }

        System.out.println(Arrays.toString(a));
    }

    public static void printarray(@NotNull int []a){
        for (int j : a) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};
        rotateArray(arr,3);


    }
}
