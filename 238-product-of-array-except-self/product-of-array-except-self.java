class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int prefixProduct = 1;
        int suffixProduct = 1;
        int [] result = new int[nums.length];

        for(int i = 0 ;i <nums.length;i++){
            result[i] = prefixProduct;
            prefixProduct *= nums[i];

        }

        for(int i = nums.length-1; i>= 0 ; i--){
            
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return result;
    }
}