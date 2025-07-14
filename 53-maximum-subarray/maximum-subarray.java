class Solution {
    
    public int maxSubArray(int[] nums) {
        
        int maxProfit = nums[0];

        int currentSum = nums[0];

        for(int i = 1;i<nums.length;i++){

           

            currentSum = currentSum+nums[i];

            if(currentSum  < nums[i]){
                currentSum = nums[i];
            }
            maxProfit = Math.max(maxProfit,currentSum);

        

        }
        return maxProfit;
    }
}