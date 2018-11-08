package leetcode;

/**
 * Created by DB_BOY on 2018/11/8.
 */
public class BestTimetoBuyandSellStock_121 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{7, 1, 5, 3, 6, 4}));
    }

    private static Object solution(int[] prices) {
        //遍历数组，找最小值，
        //计算当前值 n 和这个最小值之间的差值
        //每次选较大的利润来更新。
        int result = 0, buy = Integer.MAX_VALUE;
        for (int n : prices) {
            buy = n < buy ? n : buy;
            result = result > n - buy ? result : n - buy;
        }
        return result;
    }
}
