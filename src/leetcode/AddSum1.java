package leetcode;

import utils.Print;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by DB_BOY on 2018/9/26.
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * <p>
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 *
 * 所以返回 [0, 1]
 * <p>
 * <p>
 *    解析：
 *    一次遍历，将元素放入map中，同时找到与当前元素之和，等于目标值的元素。
 *
 */
public class AddSum1 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Print.print(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer ,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int index = target-nums[i];
            if(map.containsKey(index)){
                return new int[]{map.get(index),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no tow sum solution");
    }
}
