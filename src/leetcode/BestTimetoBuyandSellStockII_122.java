package leetcode;

/**
 * Created by DB_BOY on 2018/11/1.
 */
public class BestTimetoBuyandSellStockII_122 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{7, 1, 3, 2, 4}));
    }

    private static Object solution(int[] prices) {
        int max = 0;
        if (prices.length < 2) {
            return max;
        }
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                max += prices[i + 1] - prices[i];
            }
        }
        return max;
    }
}
