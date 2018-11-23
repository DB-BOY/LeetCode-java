package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DB_BOY on 2018/11/23.
 */
public class XofAkindinadeckofcards {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{1, 2, 3, 1, 2, 3}));
    }

    private static Object solution(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i : deck) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : map.values()) {
            res = countNum(i, res);
        }

        return res > 1;
    }

    private static int countNum(int a, int b) {
        return b > 0 ? countNum(b, a % b) : a;
    }
}
