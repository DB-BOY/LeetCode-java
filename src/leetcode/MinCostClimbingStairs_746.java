package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DB_BOY on 2018/11/9.
 */
/*
    数组的每个索引做为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。

    每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。

    您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。

    示例 1:

    输入: cost = [10, 15, 20]
    输出: 15
    解释: 最低花费是从cost[1]开始，然后走两步即可到阶梯顶，一共花费15。
     示例 2:

    输入: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
    输出: 6
    解释: 最低花费方式是从cost[0]开始，逐个经过那些1，跳过cost[3]，一共花费6。
    注意：

    cost 的长度将会在 [2, 1000]。
    每一个 cost[i] 将会是一个Integer类型，范围为 [0, 999]。


 */
public class MinCostClimbingStairs_746 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

    private static Object solution(int[] cost) {

        if (cost == null || cost.length == 0) {
            return 0;
        }
        if (cost.length == 1) {
            return cost[0];
        }

        //计算走一步、两步的花费，哪个低
        //第一步花费0，可以走一个或两个台阶
        //到达(i=2)台阶的时候，可以是 0+2 或者是1+1；
        //so， i=2时去比较 step[0]+cos[0]  step[1]+cost[1] 哪个小
        //类推
        if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }
        List<Integer> step = new ArrayList<>();
        step.add(0);
        step.add(0);
        for (int i = 2; i < cost.length + 1; i++) {
            step.add(Math.min(step.get(i - 2) + cost[i - 2], step.get(i - 1) + cost[i - 1]));
        }
        return step.get(step.size() - 1);
    }
}
