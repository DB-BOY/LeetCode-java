package leetcode;

/**
 * Created by DB_BOY on 2018/11/17.
 */
public class MaximumAverageSubarrayI_643 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }

    private static double solution(int[] nums, int k) {
        int length = nums.length;
        int sum = 0;
        for (int i = 0; i < k; i++)
            sum += nums[i];
        int i = 1, max1 = sum;
        while (i + k <= length) {
            sum -= nums[i - 1];
            sum += nums[i + k - 1];
            max1 = Math.max(max1, sum);
            i++;
        }

        return (max1 * 1.0d) / k;
    }
}
