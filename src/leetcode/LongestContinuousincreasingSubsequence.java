package leetcode;

/**
 * Created by DB_BOY on 2018/11/10.
 */
/*
    Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).

    Example 1:
    Input: [1,3,5,4,7]
    Output: 3
    Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3.
    Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4.
    Example 2:
    Input: [2,2,2,2,2]
    Output: 1
    Explanation: The longest continuous increasing subsequence is [2], its length is 1.
    Note: Length of the array will not exceed 10,000.
 */
public class LongestContinuousincreasingSubsequence {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{2, 2, 2, 2, 2, 2}));
    }

    private static Object solution(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int result = 1;
        int tmp = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                tmp++;
            } else {
                tmp = 1;
            }
            result = result > tmp ? result : tmp;
        }
        return result;
    }
}
