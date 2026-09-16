class Solution {
    public int maxArea(int[] height) {
        int n= height.length , maxArea=0 , left=0 , right=n-1; 

        while(left<right){

            int h=Math.min(height[left],height[right]);
            int w= right-left;
            int area=h*w;
            maxArea=Math.max(area,maxArea);

            if(height[left]<=height[right]){

                left++;

            }else{

                right--;

            }
        }

        return maxArea;
        
    } 
}