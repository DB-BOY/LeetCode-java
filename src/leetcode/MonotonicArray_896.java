package leetcode;

/**
 * Created by DB_BOY on 2018/10/24.
 */
/*
    判断单调数组
    单调递增，单调递减
 */
public class MonotonicArray_896 {

    public static void main(String[] arrays) {

        System.out.println(solution(new int[]{1, 1, 2}));
    }

    private static boolean solution(int[] A) {
        int length = A.length;
        if (length < 2) {
            return true;
        }
        int tmp = 0;
        int e = 0;
        for (int i = 0; i < length - 1; i++) {
            if (A[i] > A[i + 1]) {
                tmp += 1;
            } else if (A[i] < A[i + 1]) {
                tmp -= 1;
            } else {
                e++;
            }
        }
        if (tmp < 0) {
            return length - 1 == (-tmp) + e;
        } else {
            return length - 1 == tmp + e;
        }
//        return isDecrease(A)||isIncrease(A);
    }

    public static boolean isDecrease(int[] A) {
        for (int i = 0, length = A.length - 1; i < length; i++) {
            if (A[i] > A[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIncrease(int[] A) {
        for (int i = 0, length = A.length - 1; i < length; i++) {
            if (A[i] < A[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
