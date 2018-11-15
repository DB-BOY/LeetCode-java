package leetcode;

/**
 * Created by DB_BOY on 2018/11/15.
 */
public class FindPivotIndex_724 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{1, 7, 3, 6, 5, 6}));
    }

    private static Object solution(int[] nums) {

        int length = nums.length;
        if (length == 0)
            return -1;
        int left = nums[0], right = 0;
        for (int i = 0; i < length; i++) {
            right += nums[i];
        }
        if (left == right)
            return 0;
        for (int i = 1; i < length; i++) {
            left += nums[i];
            right -= nums[i - 1];
            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}
