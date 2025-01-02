// 122. Best Time to Buy and Sell Stock II

public class BestTimeBuySellStockII {
    public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        int localMaxProfit = 0;
        int localMinPrice = Integer.MAX_VALUE;
        int localMaxPrice = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];
            if (currentPrice < localMinPrice) {
                localMinPrice = currentPrice;
            }
            else {
                if (currentPrice >= localMaxPrice) {
                    int profit = currentPrice - localMinPrice;
                    if (profit > localMaxProfit) {
                        localMaxProfit = profit;
                        localMaxPrice = currentPrice;
                    }
                }
                else {
                    totalProfit += localMaxProfit;
                    localMaxProfit = 0;
                    localMinPrice = currentPrice;
                    localMaxPrice = Integer.MIN_VALUE;
                }
            }
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
