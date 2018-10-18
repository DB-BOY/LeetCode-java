package leetcode;

/**
 * Created by DB_BOY on 2018/10/18.
 */
/*
    191.Numbers of 1 bits
    Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

    Example 1:

    Input: 11
    Output: 3
    Explanation: Integer 11 has binary representation 00000000000000000000000000001011
    Example 2:

    Input: 128
    Output: 1
    Explanation: Integer 128 has binary representation 00000000000000000000000010000000
 */
public class Numberof1bits_191 {

    public static void main(String[] arrays) {
        System.out.println(solution(128));
    }

    private static Object solution(int n) {
        int i = -1;
        for (i = 0; n > 0; n >>= 1)
            i += (n & 1);
        return i;
    }
}
