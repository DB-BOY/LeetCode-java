package leetcode;

import java.util.Arrays;

/**
 * Created by DB_BOY on 2018/10/16.
 */
/*
    给定长度为 2n 的数组, 你的任务是将这些数分成 n 对,
     例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。

    示例 1:

    输入: [1,4,3,2]

    输出: 4
    解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
    提示:

    n 是正整数,范围在 [1, 10000].
    数组中的元素范围在 [-10000, 10000].
 */

public class ArrayPartitionI_561 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{1, 4, 3, 2}));
    }

    private static int solution(int[] nums) {
        //思想：贪心算法。数组排序，两两取最小后，和最大
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
