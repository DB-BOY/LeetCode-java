package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DB_BOY on 2018/10/31.
 */
/*
    Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array),
    some elements appear twice and others appear once.

    Find all the elements of [1, n] inclusive that do not appear in this array.

    Could you do it without extra space and in O(n) runtime?
    You may assume the returned list does not count as extra space.
    //不使用额外空间，时间复杂度 O(n)

    Example:

    Input:
    [4,3,2,7,8,2,3,1]

    Output:
    [5,6]
 */
public class FindDisappearedNumbers_448 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    private static List<Integer> solution(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
// 1.
//        int[] tmp = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            tmp[nums[i] - 1] = 1;
//        }
//        for (int i = 0; i < tmp.length; i++) {
//            if (tmp[i] == 0) {
//                result.add(i + 1);
//            }
//        }

        //2.如果出现，对应下标位置数字取反
        //循环非负即为没出现的数字
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0)
                nums[Math.abs(nums[i]) - 1] = -(nums[Math.abs(nums[i]) - 1]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
