class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] out = new int[nums.length];

        //first pass
        int pre = 1;

        for(int i = 0; i < nums.length; i++){
            out[i] = pre;
            pre = pre * nums[i];
        }

        //second pass
        int post = 1;

        for(int i = nums.length-1; i >= 0; i--){
            out[i] *= post;
            post = post * nums[i];
        }
        
        return out;
    }
}  
