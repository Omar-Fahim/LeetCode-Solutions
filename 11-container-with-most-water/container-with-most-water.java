class Solution {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int result = 0;
        while(left < right){
        
        result = Math.max(result,(right-left)*Math.min(height[left],height[right]));
        if(height[left] > height[right]){
            right--;
        }
        else if(height[left] < height[right]){
            left++;
        }
        else{
            right--;
            left++;
        }
            
        }
        return result;
    }
}