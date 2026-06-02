class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int buyprice = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buyprice){
                buyprice = prices[i];
            }

            maxProfit = Math.max(maxProfit, prices[i] - buyprice);
        }

        return maxProfit;
    }
}
