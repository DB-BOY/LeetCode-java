package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DB_BOY on 2018/11/2.
 */
public class DegreeofanArray_697 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{1, 2, 2, 3, 1, 4, 2}));
    }

    private static Object solution(int[] nums) {

        Map<Integer, Integer[]> map = new HashMap<>();
        //1.找到出现次数最多的数字
        //2.记录下标，找到下标差最小的
        //[0,0,0];  出现次数|第一次出现的下标|最后一次出现的下标

        int result = Integer.MAX_VALUE, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i])[2] = i;
                map.get(nums[i])[0] += 1;
            } else {
                map.put(nums[i], new Integer[]{1, i, i});
            }
            count = Math.max(count, map.get(nums[i])[0]);
        }


        for (Integer[] in : map.values()) {
            if (count == in[0]) {
                result = Math.min(result, (in[2] - in[1]) + 1);
            }
        }
        return result;
    }
}
