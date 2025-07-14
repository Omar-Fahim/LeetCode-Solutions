class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
       
       for(int i = 1;i<nums.length;i++){
        
        int num1 = nums[i];
        int num2 = max*num1;
        int num3 = min*num1;
        max = Math.max(num1,Math.max(num2,num3));
        min = Math.min(num1,Math.min(num2,num3));
        result = Math.max(result,max);

       }
       return result;
        
    }
}