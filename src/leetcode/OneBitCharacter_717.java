package leetcode;

/**
 * Created by DB_BOY on 2018/11/2.
 */
public class OneBitCharacter_717 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{1, 0, 0}));
    }

    private static Object solution(int[] bits) {
        int i = 0;
        for (; i < bits.length - 1; i++) {
            if (bits[i] == 1) {
                i++;
            }
        }
        return i == bits.length - 1;
    }
}
