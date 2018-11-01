package leetcode;

import java.util.Arrays;

/**
 * Created by DB_BOY on 2018/11/1.
 */

/*
   Given an array of integers, find if the array contains any duplicates.

    Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

    Example 1:

    Input: [1,2,3,1]
    Output: true
    Example 2:

    Input: [1,2,3,4]
    Output: false
    Example 3:

    Input: [1,1,1,3,3,4,3,2,4,2]
    Output: true
 */
public class ContainsDuplicate_217 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{1, 2, 12, 1, 3, 4, 5, 6, 7, 3}));
    }

    private static Object solution(int nums[]) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
