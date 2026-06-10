class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLength = 0;

        for(int i : nums){
            set.add(i);
        }

        for(int n : nums){
            if(!set.contains(n - 1)){
                int start = (n - 1);
                int length = 0;
                while(set.contains(start+1)){
                    length++;
                    start++;
                }
                if(length > maxLength){
                    maxLength = length;
                }
            }
        }
        return maxLength;
    }
}
