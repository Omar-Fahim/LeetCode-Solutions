class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    List<List<String>> result = new ArrayList<List<String>>();
    HashMap<String,List<String>> anagrams = new HashMap<String,List<String>>();
    
    for(int i = 0;i<strs.length;i++){

        char [] chars = strs[i].toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        anagrams.putIfAbsent(sorted,new ArrayList<String>());
        anagrams.get(sorted).add(strs[i]);
    }
   

    result.addAll(anagrams.values());
    return result;    

}
}