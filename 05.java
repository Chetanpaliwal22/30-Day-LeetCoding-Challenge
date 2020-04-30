/*
 * Input: [7,1,5,3,6,4] Output: 7 Explanation: Buy on day 2 (price = 1) and sell
 * on day 3 (price = 5), profit = 5-1 = 4. Then buy on day 4 (price = 3) and
 * sell on day 5 (price = 6), profit = 6-3 = 3.
 */

class Solution {
	public int maxProfit(int[] prices) {

		if (prices.length == 0) {
			return 0;
		}

		int pur = prices[0], sell = 0, profit = 0;

		for (int i = 1; i < prices.length; i++) {
			sell = prices[i];
			if (sell - pur > 0) {
				profit += (sell - pur);
			}
			pur = sell;
		}
		return profit;
	}
}
