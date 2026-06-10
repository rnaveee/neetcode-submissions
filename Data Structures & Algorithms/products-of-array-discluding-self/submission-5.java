class Solution {
    public int[] productExceptSelf(int[] nums) {

        int pre = 1;
        int post = 1;
        int[] res = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(i == 0) res[i] = pre;
            else res[i] = pre * res[i-1];
            pre = nums[i];
        }
        for(int i = nums.length-1; i >=0; i--){
            res[i] = post * res[i];
            if(i == nums.length-1) post = nums[i];
            else post = post * nums[i];
        }
        return res;        
    }
} 