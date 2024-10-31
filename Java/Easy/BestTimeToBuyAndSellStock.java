package Easy;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;

        while (right < prices.length) {
            int buy = prices[left];
            int sell = prices[right];

            if (sell > buy) {
                maxProfit = Math.max(maxProfit, sell - buy);
            } else {
                left = right;
            }

            right++;
        }

        return maxProfit;
    }
}
