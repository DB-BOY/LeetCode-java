package leetcode;

/**
 * Created by DB_BOY on 2018/11/13.
 */
/*

    Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

    Example:

    Input: [-2,1,-3,4,-1,2,1,-5,4],
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.
    Follow up:

    If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class MaximumSubarry_53 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{-2}));
    }

    private static Object solution(int[] nums) {

        int length = nums.length;
//        int sum =Integer.MIN_VALUE , tmp;
//        for (int i = 0; i < length; i++) {
//            tmp = 0;
//            for (int j = i; j < length; j++) {
//                tmp +=nums[j];
//                if (tmp > sum) {
//                    sum = tmp;
//                }
//            }
//        }


        int tmp = nums[0];
        int sum = nums[0];
        for (int i = 1; i < length; i++) {
            tmp = Math.max(nums[i], nums[i] + tmp);
            sum = Math.max(tmp, sum);
        }

        return sum;
    }
}
