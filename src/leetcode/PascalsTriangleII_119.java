package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DB_BOY on 2018/11/12.
 */
/*
    Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.

    Note that the row index starts from 0.


    In Pascal's triangle, each number is the sum of the two numbers directly above it.

    Example:

    Input: 3
    Output: [1,3,3,1]
    Follow up:

    Could you optimize your algorithm to use only O(k) extra space?
    杨辉三角，返回第n行
 */
public class PascalsTriangleII_119 {

    public static void main(String[] arrays) {
        List<Integer> list = solution(0);
        System.out.println("-------------------");
        for (Integer integer : list) {
            System.out.print(integer);
            System.out.print(" ");
        }
        System.out.println();
    }

    private static List<Integer> solution(int rowIndex) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            list.add(1);
            for (int j = i - 1; j >= 1; j--) {
                list.set(j, list.get(j - 1) + list.get(j));
            }
        }
        return list;
    }
}
