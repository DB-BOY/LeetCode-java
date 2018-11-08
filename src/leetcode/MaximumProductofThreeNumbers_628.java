package leetcode;

import java.util.Arrays;

/**
 * Created by DB_BOY on 2018/11/7.
 */
/*
    Given an integer array, find three numbers whose product is maximum and output the maximum product.

    Example 1:
    Input: [1,2,3]
    Output: 6
    Example 2:
    Input: [1,2,3,4]
    Output: 24
    Note:
    The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
    Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.

 */
public class MaximumProductofThreeNumbers_628 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{-4, 3, 5}));
    }

    private static Object solution(int[] nums) {
        int end = nums.length - 1;
        if (end == 2) {
            return nums[0] * nums[1] * nums[2];
        }
        //三个数求积最大
        //思路：数组排序
        //1. 后三个数乘积 (全正)
        //2. 后两个，前一个 (两正一负)
        //3. 后一个，前两个 (一正两负)
        Arrays.sort(nums);

        int product1 = nums[end - 2] * nums[end - 1] * nums[end];
        int product2 = nums[0] * nums[end - 1] * nums[end];
        int product3 = nums[0] * nums[1] * nums[end];

        product1 = Math.max(product1, product2);
        product1 = Math.max(product1, product3);

        return product1;
    }
}
