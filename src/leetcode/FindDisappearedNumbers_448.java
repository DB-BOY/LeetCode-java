package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DB_BOY on 2018/10/31.
 */
public class FindDisappearedNumbers_448 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    private static List<Integer> solution(int[] nums) {
        int[] tmp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tmp[nums[i] - 1] = 1;
        }
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] == 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
