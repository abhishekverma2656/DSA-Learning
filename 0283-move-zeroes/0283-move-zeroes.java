class Solution {
    public void moveZeroes(int[] nums) {
         int n= nums.length;
         int pos=0;
         int left=0;

         while(left<n){
            if(nums[left]!=0){
                int temp=nums[left];
                nums[left]=nums[pos];
                nums[pos]=temp;
                left++;
                pos++;

            }else if(nums[pos]!=0 ){
                pos++;
            }
            
            else{
                left++;
            }

         }
        
    }
}