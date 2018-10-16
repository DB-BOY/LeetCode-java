package leetcode;

/**
 * Created by DB_BOY on 2018/9/30.
 * 汉明顿距离
 */
/*
两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。

给出两个整数 x 和 y，计算它们之间的汉明距离。

注意：
0 ≤ x, y < 231.

示例:

输入: x = 1, y = 4

输出: 2

解释:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
上面的箭头指出了对应二进制位不同的位置。
*/
public class HammingDistance_461 {
    public static void main(String[] args) {
        int x = 1, y = 4;
        System.out.println(solution(x, y));
    }

    private static int solution(int x, int y) {
        int num = x ^ y;
        int count = 0;
        while (num > 0) {
            num &= (num - 1);
            ++count;
        }
        return count;
    }
}
