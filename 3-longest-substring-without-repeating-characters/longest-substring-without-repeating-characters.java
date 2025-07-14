class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> Window = new HashSet<Character>();
        int left = 0;int right = 0; int result = 0;
        while(right <s.length()){
            
            if(!Window.contains(s.charAt(right))){
                Window.add(s.charAt(right));
                result = Math.max(result,right-left+1);
                right++;
            }
            else{
                Window.remove(s.charAt(left));
                left++;

            }
        }
        return result;

    }
}