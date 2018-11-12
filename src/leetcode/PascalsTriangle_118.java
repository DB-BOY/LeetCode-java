package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DB_BOY on 2018/11/12.
 */
public class PascalsTriangle_118 {

    public static void main(String[] arrays) {
        List<List<Integer>> list = solution(0);
        System.out.println("-------------------");
        for (List<Integer> integers : list) {
            for (Integer integer : integers) {
                System.out.print(integer);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> solution(int numRows) {

        List<List<Integer>> list = new ArrayList<>();
        if (numRows < 1) {
            return list;
        }
        List<Integer> sub = new ArrayList<>();
        if (numRows < 2) {
            sub.add(1);
            list.add(sub);
            return list;
        }
        for (int i = 0; i < numRows; i++) {
            sub = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    sub.add(1);
                } else {
                    List<Integer> up = list.get(i - 1);
                    sub.add(up.get(j - 1) + up.get(j));
                }
            }
            list.add(sub);
        }
        return list;
    }
}
