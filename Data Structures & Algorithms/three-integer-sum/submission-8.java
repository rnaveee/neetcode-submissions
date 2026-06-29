class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        //[-1, 0, 1, 2, -1, -4]

        //[-4, -1, -1, 0, 1, 2] array.sort

        //num[i] = -4
        //num[i+1] + nums[length-1] = -1 + 2 + num[i](4) = 5(eval)
        // eval < 0 r--
        // else l++
        // ... o(n^2)

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
    
            int l = i + 1;
            int r = nums.length-1;

            while(l < r){
                int eval = nums[i] + nums[l] + nums[r];
                if(eval == 0){
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;

                    while(l < r && nums[l] == nums[l-1]){
                        l++;
                    }
                    while(l < r && nums[r] == nums[r+1]){
                        r--;
                    }
                } else {
                    if(eval < 0){
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return res;
    }
}
