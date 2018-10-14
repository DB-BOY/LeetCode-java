package leetcode;

/**
 * Created by DB_BOY on 2018/10/14.
 */
public class LemonadeChange860 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{5, 5, 10, 20}));
    }

    private static boolean solution(int[] bills) {

        int[] charge = new int[]{0, 0, 0};
        for (int bill : bills) {
            if (bill == 5) {
                charge[0]++;
                continue;
            } else if (bill == 10) {
                if (charge[0] > 0) {
                    charge[0]--;
                    charge[1]++;
                    continue;
                }
                return false;
            } else {
                if (charge[0] > 0 && charge[1] > 0) {
                    charge[0]--;
                    charge[1]--;
                    charge[2]++;
                    continue;
                } else if (charge[0] >= 3) {
                    charge[0] -= 3;
                    charge[2]++;
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}
