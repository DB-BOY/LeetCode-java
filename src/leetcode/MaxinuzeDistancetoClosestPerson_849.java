package leetcode;

/**
 * Created by DB_BOY on 2018/11/16.
 */
public class MaxinuzeDistancetoClosestPerson_849 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{1, 0, 0, 0}));
        System.out.println(solution1(new int[]{1, 0, 0, 0}));
    }

    private static Object solution1(int[] seats) {

        int length = seats.length;
        if (length == 1) {

        }


        return 1;
    }

    private static Object solution(int[] seats) {
        int tmp = 0, distance = 0, start = -1, end = -1;
        int length = seats.length;
        int i;
        for (i = 0; i < length; i++) {
            if (seats[i] == 1) {
                tmp = 0;
                start = i;
            } else {
                tmp++;
                distance = tmp > distance ? tmp : distance;
                end = i;
            }
        }
        if (start == 0 && end == length - 1) {
            return end;
        } else if (start == length - 1 && end == start - 1) {
            return 0;
        }
        distance = tmp > distance ? tmp : distance;
        System.out.println(distance + " " + start + " " + end);

        if (i == seats.length && (start == -1 || end == -1)) {
            distance = tmp;
            System.out.println(distance + " " + start + " " + end);
        }

        return distance;
    }
}
