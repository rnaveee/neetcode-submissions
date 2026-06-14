class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> freq = new HashMap<>();

        for(String s : strs){

            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if(!freq.containsKey(sorted)){
                freq.put(sorted, new ArrayList<>());
            }

            freq.get(sorted).add(s);
        }

        return new ArrayList<>(freq.values());
        
    }
}
