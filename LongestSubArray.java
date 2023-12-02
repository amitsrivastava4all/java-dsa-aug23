// {3,1,2,7,4,2,1,1,5}
class LongestSubArray{
    static int computeLongestSubArrayLen(int []nums, int k){
        // maintain left and right pointer
        int left = 0;
        int sum = 0;
        int maxLen = 0;
        for(int right = 0; right<nums.length; right++){
            sum = sum + nums[right];
            if(sum>k){
                sum = sum - nums[left];
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            // int len = right - left + 1;
            // if(len>maxLen){
            //     maxLen = len;
            // }

        }
        return maxLen;

    }
    public static void main(String[] args) {
       int nums[] =  {3,1,2,7,4,2,1,1,5};
       int k = 8;
       System.out.println(computeLongestSubArrayLen(nums, k));
       
    }
}