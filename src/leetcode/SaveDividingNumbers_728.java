package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DB_BOY on 2018/10/10.
 */
/*
    自除数 是指可以被它包含的每一位数除尽的数。

    例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。

    还有，自除数不允许包含 0 。

    给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。

    示例 1：

    输入：
    上边界left = 1, 下边界right = 22
    输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
    注意：

        每个输入参数的边界满足 1 <= left <= right <= 10000。
 */
public class SaveDividingNumbers_728 {

    public static void main(String[] arrays) {
        System.out.println(solution(300, 708));
    }

    private static List<Integer> solution(int left, int right) {
        if(left > right || left <= 0 || right > 10000){
            return null;
        }
        /*
        两层循环
        外层循环left-> right
        内层逻辑
         */
        List<Integer> list = new ArrayList<>();
        int tmp, num;
        out:
        for (; left <= right; left++) {
            if (left % 10 == 0) {
                continue out;
            } else if (left <= 9) {
                list.add(left);
                continue out;
            }
            num = left;
            while (true) {
                tmp = num % 10;
                if (tmp  == 0) {
                    continue out;
                } else if (left % tmp != 0) {
                    continue out;
                }
                tmp = num / 10;
                if (tmp <= 9) {
                    if (left % tmp != 0) {
                        continue out;
                    }
                    list.add(left);
                    continue out;
                }
                num = tmp;
            }
        }
        return list;
    }
}
