public class BestTimeToBuyAndSellStockII {
	public int maxProfit(int[] prices) {
		// write your code here
		int profit = 0;
		if (prices.length < 2) {
			return profit;
		} else {
			for (int i = 1; i < prices.length; i++) {
				int diff = prices[i] - prices[i - 1];
				if (diff > 0) {
					profit += diff;
				}
			}
		}
		return profit;
	}
}
