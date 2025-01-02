// 122. Best Time to Buy and Sell Stock II

public class BestTimeBuySellStockII {
    public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        int localMaxProfit = 0;
        int localMinPrice = Integer.MAX_VALUE;
        int localMaxPrice = Integer.MIN_VALUE;
        int share = 0;
        for (int currentPrice : prices) {
            if (currentPrice <= localMinPrice && share == 0) {
                localMinPrice = currentPrice;
            } else {
                share = 1;
                if (currentPrice >= localMaxPrice) {
                    int profit = currentPrice - localMinPrice;
                    if (profit > localMaxProfit) {
                        localMaxProfit = profit;
                        localMaxPrice = currentPrice;
                    }
                } else {
                    share = 0;
                    totalProfit += localMaxProfit;
                    localMaxProfit = 0;
                    localMinPrice = currentPrice;
                    localMaxPrice = Integer.MIN_VALUE;
                }
            }
        }
        if (share == 1)
            totalProfit += localMaxProfit;
        return totalProfit;
    }

    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
//        int[] prices = {1,2,3,4,5};
//        int[] prices = {6,1,3,2,4,7};
//        int[] prices = {2,1,2,0,1};
        int[] prices = {8,6,4,3,3,2,3,5,8,3,8,2,6};
                System.out.println(maxProfit(prices));
    }
}
