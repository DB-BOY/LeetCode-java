package leetcode;

import java.util.Arrays;

/**
 * Created by DB_BOY on 2018/10/31.
 */
/*
    Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

    You may assume that the array is non-empty and the majority element always exist in the array.

    Example 1:

    Input: [3,2,3]
    Output: 3
    Example 2:

    Input: [2,2,1,1,1,2,2]
    Output: 2

 */
public class MajorityElement_169 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{2, 1, 2, 1, 1, 1, 2, 2}));
    }

    private static int solution(int nums[]) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
