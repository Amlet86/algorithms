package LeetCode;

public class BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {
        int result = maxProfit(new int[]{7, 1, 5, 3, 6, 99});
        System.out.println(result);
    }

    private static int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                result += prices[i] - prices[i - 1];
        }
        return result;
    }

}
