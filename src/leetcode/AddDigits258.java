package leetcode;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the
 * result has only one digit.
 * 
 * For example:
 * 
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only
 * one digit, return it.
 * 
 * Follow up: Could you do it without any loop/recursion in O(1) runtime?
 *
 *
 * 给出一个非负整数，各个位相加，直到结果为个位数。
 *
 * 升级：不使用循环/递归，时间复杂度O(1)
 *
 * 1： 1
 * 2： 2
 * ...
 * 10: 1
 * 11: 2
 * ...
 * 20: 2
 * 21: 3
 * ...
 * ...
 * 55: 10: 1
 * 66: 12: 3
 * 88: 16: 7
 * ...
 *
 * (n-1)%9+1
 *
 *
 * @author db_boy
 */
public class AddDigits258 {

	public static void main(String[] args) {
		int num = 98;
		System.out.println(addDigits(num));
	}

	public static int addDigits(int num) {
		return (num - 1) % 9 + 1;
	}
}
