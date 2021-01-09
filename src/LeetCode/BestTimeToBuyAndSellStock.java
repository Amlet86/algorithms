package LeetCode;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int result = maxProfit(new int[]{2, 4, 1});
        System.out.println(result);
    }

    private static int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                result = Math.max(prices[j] - prices[i], result);
            }
        }
        return result;
    }

}
