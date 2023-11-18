public class TargetSumCheck {

    static boolean isTargetSum(int [] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int currentSum = nums[left] + nums[right];
            if(currentSum== target){
                return true;
            }
            if(currentSum>target){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,5,7,20,25,30,44};
        int target = 90;
        System.out.println(isTargetSum(nums, target)?"Target Sum Exist ":"Not Exist");
    }
}
