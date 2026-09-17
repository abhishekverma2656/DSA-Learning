class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count=0;
        int maxCount=0;
        int i=0 , n=nums.length;

        while(i<n){
            if(nums[i]==1){
                count++;
                i++;

            }else{
                maxCount=Math.max(maxCount,count);
                count=0;
                i++;

            }
        }
        return Math.max(maxCount,count);
        
    }
}