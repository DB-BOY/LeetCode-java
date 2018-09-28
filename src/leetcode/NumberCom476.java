package leetcode;

/**
 * Created by DB_BOY on 2017/5/22.
 * 数字补数
 * <br/>
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 * <p>
 * 注意:
 * <p>
 * 给定的整数保证在32位带符号整数的范围内。
 * 你可以假定二进制数不包含前导零位。
 * 示例 1:
 * <p>
 * 输入: 5
 * <p>
 * 输出: 2
 * <p>
 * 解释: 5的二进制表示为101（没有前导零位），其补数为010。所以你需要输出2。
 * <p>
 * 示例 2:
 * <p>
 * 输入: 1
 * <p>
 * 输出: 0
 * <p>
 * 解释: 1的二进制表示为1（没有前导零位），其补数为0。所以你需要输出0。
 */
public class NumberCom476 {
    public static void main(String[] args) {
        System.out.println(g(5));
    }

    public static int g(int num) {
        int mask = 1, temp = num;
        //101
        //1010   10
        //10100  01
        //101000 00

        //int mask = (Integer.highestOneBit(num) << 1) - 1;
//        return num^mask;

        while (temp > 0) {
            mask = mask << 1;
            temp = temp >> 1;
//            System.out.println("mask： " + mask + " temp: " + temp);
        }
        return num ^ (mask - 1);
    }
}
