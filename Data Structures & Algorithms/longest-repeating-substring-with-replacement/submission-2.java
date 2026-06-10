class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int right = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        int max = 0;

        int res = 0;

        while(right < s.length()){
            char curr = s.charAt(right);
            freq.put(curr, freq.getOrDefault(curr, 0) + 1);
            max = Math.max(max, freq.get(curr));

            if(((right - left + 1) - max) > k){
                char c = s.charAt(left);
                freq.put(c, freq.get(c) - 1);
                left++;
            }

            res = Math.max(res, right - left + 1);
            right++;
        }
        
        return res;
        
    }
}
