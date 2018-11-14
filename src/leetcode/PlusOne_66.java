package leetcode;

/**
 * Created by DB_BOY on 2018/11/14.
 */
/*
    加一
    判断进位
 */
public class PlusOne_66 {

    public static void main(String[] arrays) {
        int[] l = solution(new int[]{9, 9, 0, 9});
        for (int i : l) {
            System.out.print(i);
        }
    }

    private static int[] solution(int[] digits) {
        int end = digits.length - 1;
        while (end > -1) {
            if (digits[end] == 9) {
                digits[end] = 0;
                end--;
            } else {
                digits[end] = digits[end] + 1;
                break;
            }
        }
        if (end == -1) {
            int[] s = new int[digits.length + 1];
            s[0] = 1;
            System.arraycopy(s, 1, digits, 0, digits.length);
            return s;
        }
        return digits;
    }
}
