package leetcode;

import java.util.Arrays;

/**
 * Created by DB_BOY on 2018/10/29.
 */
public class MoveZeroes_283 {

    public static void main(String[] arrays) {
        solution(new int[]{0, 0, 1, 0, 0, 3, 12});
    }

    private static void solution(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
