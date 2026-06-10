class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0;
        int right = 1;

        while(left < right && right < prices.length){
            int profit = prices[right] - prices[left];

            if(prices[right] < prices[left]){
                left = right;
            }
            right++;

            if(profit > maxProfit){
                maxProfit = profit;
            }

        }
        return maxProfit;
    }
}
