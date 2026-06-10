class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int j = 0; j < nums.length; j++){
            int diff = target - nums[j];

            if(map.containsKey(diff) && map.get(diff) != j){
                return new int[]{j, map.get(diff)};
            }
        }

        return new int[0];
    }
}
