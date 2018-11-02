package leetcode;

import utils.Print;

import java.util.Arrays;

/**
 * Created by DB_BOY on 2018/11/2.
 */
/*
    Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

    The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

    Note:

    Your returned answers (both index1 and index2) are not zero-based.
    You may assume that each input would have exactly one solution and you may not use the same element twice.
    Example:

    Input: numbers = [2,7,11,15], target = 9
    Output: [1,2]
    Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class TwoSumII_167 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Print.print(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{0, 0};
        int tmp;
        int low = 0, high = nums.length - 1;
        while (low < high) {
            tmp = nums[low] + nums[high];
            if (tmp == target) {
                result[0] = low + 1;
                result[1] = high + 1;
                return result;
            } else if (tmp < target) {
                low++;
            } else {
                high--;
            }
        }

        throw new IllegalArgumentException("no tow sum solution");
    }
}
