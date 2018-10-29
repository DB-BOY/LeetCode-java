package leetcode;

/**
 * Created by DB_BOY on 2018/10/29.
 */
public class MaxConsecutiveOnes_485 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{1, 1, 0, 1, 1, 1}));
    }

    private static int solution(int[] nums) {
        int max = 0, tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                tmp = 0;
            } else {
                tmp += 1;
                max = (tmp > max) ? tmp : max;
            }
        }
        return max;
    }
}
