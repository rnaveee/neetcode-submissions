class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String strSorted = new String(str);

            if(!map.containsKey(strSorted)){
                map.put(strSorted, new ArrayList<>());
            }

            map.get(strSorted).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}
