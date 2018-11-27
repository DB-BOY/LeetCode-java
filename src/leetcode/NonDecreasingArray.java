package leetcode;

/**
 * Created by DB_BOY on 2018/11/27.
 */
public class NonDecreasingArray {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{3, 4, 2, 3}));
    }

    private static Object solution(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length && count < 2; i++) {
            if (nums[i] >= nums[i - 1]) continue;
            if (i - 2 >= 0 && nums[i] < nums[i - 2]) {
                nums[i] = nums[i - 1];
            } else {
                nums[i - 1] = nums[i];
            }
            count++;
        }
        return count <= 1;
    }
}
