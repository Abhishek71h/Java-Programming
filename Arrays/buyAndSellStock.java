package Arrays;

public class buyAndSellStock {
    public static int buyAndSellStockProblem(int prices[], int n) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<n; i++) {
            if(buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else buyPrice = prices[i];
        }
        return maxProfit;
    }
    public static void main(String args[]) {
        int prices[] = {7,1,5,3,6,4};
        int n = prices.length;
        int ans = buyAndSellStockProblem(prices, n);
        System.out.print("Maximum Profit is: " + ans);
    }
}
