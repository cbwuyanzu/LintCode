public class StockII {
	public int maxProfit(int[] prices) {
		// write your code here
		int profit = 0;
		if (prices.length == 0) {
			return profit;
		} else {
			int price = prices[0];
			for (int i = 1; i < prices.length; i++) {
				if (prices[i + 1] > price) {
					profit = prices[i] - price;
					price = prices[i];
				}
			}
		}
		return profit;
	}
};
