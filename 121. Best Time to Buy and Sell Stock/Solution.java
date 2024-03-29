//  Author: Tushar Jayanti
//  github: https://github.com/tusharjayanti
// LinkedIn: https://www.linkedin.com/in/tusharjayanti/

// Runtime : O(n)
// Space : O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
