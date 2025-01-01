// 121. Best Time to Buy and Sell Stock

public class BestTimeBuySellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int minPriceDate = 0;
        int maxProfitValue = 0;
        int maxProfitBuyingDate = 0;
        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];
            if (currentPrice < minPrice) {
                minPrice = prices[i];
                minPriceDate = i + 1;
            }
            if (currentPrice - minPrice > maxProfitValue) {
                maxProfitValue = currentPrice - minPrice;
                maxProfitBuyingDate = minPriceDate;
            }
        }
        System.out.println("Buying stock on Day " + maxProfitBuyingDate + " can get max profit, which is " + maxProfitValue);
        return maxProfitValue;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        maxProfit(prices);
    }
}
