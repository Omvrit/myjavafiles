public class Main {
    public static void main(String[] args) {
        String version1 = "1.1.1";
        String version2 = "1.1";
        String[] arr1 = new String[500];
        String[] arr2 = new String[500];
        for(int i =0;i<500;i++){
            arr1[i] = "0";
            arr2[i] = "0";
        }
        int flag =0;
        int l = 0;
        int a =0;
        int siz1 = 0;
        int siz2 =0;
        int size1 = version1.length();
        int size2 = version2.length();
        for(int  i =0;i<size1;){
            while( i<size1 && version1.charAt(i)!='.' ){
                i++;
            }
            arr1[a] = version1.substring(l,i);
            siz1++;
            i++;
            l = i;
            a++;

        }
        l=0;
        a=0;
        for(int  i =0;i<size2;){
            while(i<size2 && version2.charAt(i)!='.'){
                i++;
            }
            arr2[a] = version2.substring(l,i);
            i++;
            siz2++;
            l = i;
            a++;

        }
        for(int i=0;i<Math.max(siz1,siz2);i++ ){
            int a1 = Integer.parseInt(arr1[i]);
            int b1 = Integer.parseInt(arr2[i]);
            if(a1>b1)
            {
                flag =1;
                break;
            }
            else if(b1>a1){
                flag =-1;
                break;
            }


        }
        System.out.println(flag);;

    }
}