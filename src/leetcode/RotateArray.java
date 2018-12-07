package leetcode;

import java.util.Arrays;

/**
 * Created by DB_BOY on 2018/12/7.
 */
/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

    Input: [1,2,3,4,5,6,7] and k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

    Input: [-1,-100,3,99] and k = 2
    Output: [3,99,-1,-100]
    Explanation:
    rotate 1 steps to the right: [99,-1,-100,3]
    rotate 2 steps to the right: [3,99,-1,-100]
Note:

Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?
 */
public class RotateArray {

    public static void main(String[] arrays) {
        int[] x = new int[]{1, 2, 3, 4, 5, 6, 7};
        solution(x, 3);
        System.out.println(Arrays.toString(x));
    }

    private static void solution(int[] nums, int k) {
        int length = nums.length;
//        int[] tmp = nums.clone();
//        for(int i =0;i<length;i++){
//            nums[(i + k)%length] = tmp[i];
//        }
        int[] tmp = new int[length];
        for (int i = 0; i < length; i++) {
            tmp[(i + k) % length] = nums[i];
            System.out.println(Arrays.toString(tmp));
        }
        System.out.println("");
        System.out.println("");
        System.out.println(Arrays.toString(tmp));
    }
}
