class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        if(s.length() == 0) return 0;
        int max = 0;
        int right = 0;
        int left = 0;

        while(right < s.length()){
            int temp = right - left + 1;
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            } else {
                if(temp > max){
                    max = temp;
                }
                set.add(s.charAt(right));
                right++;
            }
            System.out.println(max);
        }

        return max;

        
    }
}
