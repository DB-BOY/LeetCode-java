package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DB_BOY on 2018/11/1.
 */

/*
   Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

    Example 1:

    Input: nums = [1,2,3,1], k = 3
    Output: true
    Example 2:

    Input: nums = [1,0,1,1], k = 1
    Output: true
    Example 3:

    Input: nums = [1,2,3,1,2,3], k = 2
    Output: false
 */
public class ContainsDuplicate_219 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{1, 0, 1, 1}, 1));
    }

    private static Object solution(int nums[], int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (map.containsKey(nums[i])) {
                int index = map.get(nums[i]);
                return i - index <= k;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
