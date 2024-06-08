public class Leetcode34FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int result[] = new int [2];
        int nums[] = {1,2,3,4,5,6,6,8,8,8};
        int target = 9;

        int lo=0;int high = nums.length-1;
        int lb = nums.length;int ub = nums.length;
        while(lo<=high){
            int mid = lo -(lo-high)/2;
            if(nums[mid]>=target){
                lb = Math.min(lb,mid);
                high = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        lo=0; high = nums.length-1;
        while(lo<=high){
            int mid = lo -(lo-high)/2;
            if(nums[mid]>target){
                ub = Math.min(ub,mid);
                high = mid -1;
            }
            else{
                lo = mid+1;
            }
        }
        if(lb < nums.length && nums[lb]==target )
            result[0] = lb;
        else result[0] = -1;
        if(nums[ub-1]==target)
            result[1] = ub-1;
        else result[1]=-1;
        System.out.println(result[0]+" "+result[1]);


    }
}
