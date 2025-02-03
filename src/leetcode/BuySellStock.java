package leetcode;

public class BuySellStock {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
       int maxProfit = 0;
        int n = prices.length;
       int maxRight = prices[n-1];
       for(int i= n-2; i>=0; i--){
            maxRight = Integer.max(prices[i], maxRight);
            maxProfit = Integer.max(maxProfit, maxRight-prices[i]);
       }
       return maxProfit;
    }
}
