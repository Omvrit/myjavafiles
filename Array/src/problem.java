public class problem {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,2,2,3,3,4,5};
        int diff = 0;
        int a =0 ;
        for(int i =0 ;i<nums.length-1;){
            for(int j= i+1;j<nums.length;){
                if(nums[i]!=nums[j]){
                    nums[a]=nums[i];
                    diff++;
                    a++;
                    i=j;
                    break;

                }
                else{
                    j++;
                    i++;
                }
            }
        }
        nums[a]=nums[nums.length-1];
        diff++;
    }
}
