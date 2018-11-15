package leetcode;

/**
 * Created by DB_BOY on 2018/11/15.
 */
/*
    In a given integer array nums, there is always exactly one largest element.

    Find whether the largest element in the array is at least twice as much as every other number in the array.

    If it is, return the index of the largest element, otherwise return -1.

    Example 1:

    Input: nums = [3, 6, 1, 0]
    Output: 1
    Explanation: 6 is the largest integer, and for every other number in the array x,
    6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.


    Example 2:

    Input: nums = [1, 2, 3, 4]
    Output: -1
    Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.


    Note:

    nums will have a length in the range [1, 50].
    Every nums[i] will be an integer in the range [0, 99].
 */
public class LargestNumberAtLeastTwiceofOthers_747 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{2}));
    }

    private static Object solution(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int pos = -1;
        for (int i = 0, length = nums.length; i < length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
                pos = i;
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }
        return (max1 >= 2 * max2) ? pos : -1;
    }
}
