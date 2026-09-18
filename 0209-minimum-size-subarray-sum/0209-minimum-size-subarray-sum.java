class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left=0, maxLength=Integer.MAX_VALUE, sum=0;

        for(int right=0;right<nums.length;right++){

            sum+=nums[right];

            while(sum>=target){
                maxLength=Math.min(maxLength,right-left+1);
                sum-=nums[left];
                left++;
            }

        }

        return maxLength==Integer.MAX_VALUE ? 0:maxLength;
        
    }
}