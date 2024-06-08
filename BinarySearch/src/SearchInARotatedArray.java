import java.util.Scanner;
public class SearchInARotatedArray {
    public static void main(String[] args) {
        int []nums = {4,5,6,7,0,1,2};
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt() ;
        int flag = -1;
        int max= nums.length-1;
        int lo = 0;
        int hi =nums.length-1;;
        while(lo<=hi){
            int mid = lo - (lo-hi)/2;
            if(target == nums[mid]){
                flag  = mid;
                break;

            }
            else if(target > nums[mid]){
            if(mid>0 && nums[mid]>nums[mid -1] && nums[mid]<nums[mid + 1]){
                if(nums[0]<nums[mid]){
                    lo = mid +1;
                }
                else if(nums[max] > nums[mid]){
                    hi  = mid -1;
                }
            }
            else if(mid>0 && nums[mid]>nums[mid -1] && nums[mid]>nums[mid + 1]){
                    flag = -1;
                    break;
            }
            else if(mid>0 && nums[mid]<nums[mid -1] && nums[mid]<nums[mid + 1]){
                if(target>nums[hi]){
                    hi = mid -1;
                }
            }

        }
        else{//target<nums[i]
                if(mid>0 && nums[mid]>nums[mid -1] && nums[mid]<nums[mid + 1]){
                    if(nums[0]<nums[mid] && target>=nums[0]){
                        hi = mid -1;
                    }
                    else if(nums[max] > nums[mid]){
                        hi  = mid -1;
                    }
                }
                else if(mid>0 && nums[mid]>nums[mid -1] && nums[mid]>nums[mid + 1]){
                    flag = -1;
                    break;
                }
                else if(mid>0 && nums[mid]<nums[mid -1] && nums[mid]<nums[mid + 1]){
                    if(target>nums[hi]){
                        hi = mid -1;
                    }
                }


            }



        }
        System.out.println(flag);


    }
}
