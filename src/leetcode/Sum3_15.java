package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by DB_BOY on 2018/10/18.
 * 15 3Sum
 * 三数之和
 */
/*
    Given an array nums of n integers, are there elements a, b, c in nums
    such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

    Note:

    The solution set must not contain duplicate triplets.

    Example:

    Given array nums = [-1, 0, 1, 2, -1, -4],

    A solution set is:
    [
      [-1, 0, 1],
      [-1, -1, 2]
    ]


    思路：排序后，类似查找
    一趟遍历 value =  nums[i]
    在 nums[i+1] ~ nums[length-1]范围内找 -value

 */
public class Sum3_15 {

    public static void main(String[] arrays) {

        System.out.println(solution(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    private static List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result;
        if (nums.length < 3) {
            result = null;
        } else {
            Arrays.sort(nums);
            result = new ArrayList<>();
            List<Integer> sub;
            int value, start, end, tmp;
            for (int i = 0; i < nums.length; i++) {
//                //去重
//                if(i>0&&nums[i]==nums[i-1]){
//                    continue;
//                }
                value = nums[i];
                start = i + 1;
                end = nums.length - 1;
                while (start < end) {
                    tmp = -(nums[start] + nums[end]);
                    if (value == tmp) {
                        sub = new ArrayList<>();
                        sub.add(nums[i]);
                        sub.add(nums[start]);
                        sub.add(nums[end]);
                        result.add(sub);
                        //移动指针 去重
                        while (start < end && nums[start] == nums[start + 1]) {
                            start++;
                        }
                        while (start < end && nums[end] == nums[end - 1]) {
                            end--;
                        }

                        start++;
                        end--;
                    } else if (value > tmp) {
                        end--;
                    } else {
                        start++;
                    }
                }

                //去重 -1 -1
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    i++;
                }

            }
        }
        return result;
    }
}
