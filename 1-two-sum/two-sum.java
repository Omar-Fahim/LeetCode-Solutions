import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int [2];
        HashMap<Integer, Integer>foundElements = new HashMap<Integer, Integer>();
        for (int i= 0; i <nums.length;i++){
            if(foundElements.containsKey(target-nums[i])){
                ans[0] = foundElements.get(target-nums[i]);
                ans[1] = i;
            }
            else{
                foundElements.put(nums[i],i);
            }
        }
        return ans;
    }
}