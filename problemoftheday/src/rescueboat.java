import java.util.Arrays;

public class rescueboat {
    public static void main(String[] args) {
        int []people = {3,8,4,9,2,2,7,1,6,10,6,7,1,7,7,6,4,4,10,1};
        int limit = 10;
        System.out.println(Arrays.toString(people));
        int size = people.length;

        int boat = 0;


        for(int i =0 ;i<size;i++){

            if(people[i]!=0){
                int remindex = i;
                for(int j = i+1;j<size;){
                    if(people[j]!=0){

                        if(people[i]+people[j]>limit){
                            j++;
                        }
                        else if(people[i]+people[j]==limit){
                            people[j] = 0;
                            people[i] = 0;
                            remindex = i;
                            boat++;
                            break;
                        }
                        else{
                            if(true){
                                remindex = j;}

                            j++;

                        }
                    }
                    else{
                        j++;
                    }}
                if(remindex != i ){
                    people[remindex] = 0;
                    people[i] = 0;
                    boat++;
                }
                if(people[i]!=0){
                    boat++;
                    people[i]=0;
                }

            }
            System.out.println(Arrays.toString(people));
        }
        System.out.println(Arrays.toString(people));
        System.out.println( boat);
        if(people[size - 1]!=0)
        {
            boat++;
        }


        System.out.println( boat);
    }
}
