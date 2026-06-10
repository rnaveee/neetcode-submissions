class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = 0;
        int sell = 1;

        while(buy < sell && sell < prices.length){
            int profit = prices[sell] - prices[buy];

            if(prices[sell] < prices[buy]){
                buy = sell;
            } else {
                maxProfit = Math.max(maxProfit, profit);
            }
            sell++;
        }

        return maxProfit;
    }
}
