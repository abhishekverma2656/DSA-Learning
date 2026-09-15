class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;

            int i=0;
            int left=0, right=n-1;

            while (left<=right){
                if(nums[left]==0){
                   
                   int temp=nums[left];
                   nums[left]=nums[i];
                   nums[i]=temp;
                   i++;
                   left++;
                }
                else if(nums[left]==2){
                     int temp=nums[left];
                   nums[left]=nums[right];
                   nums[right]=temp;
                   right--;

                }else{
                    left++;
                }


            
        }
        
        
    }

}