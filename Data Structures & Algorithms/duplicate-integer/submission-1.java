class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            numsMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            if(numsMap.containsKey(nums[i]) && numsMap.get(nums[i]) != i){
                return true;
            }
        }
        return false;
    }
}