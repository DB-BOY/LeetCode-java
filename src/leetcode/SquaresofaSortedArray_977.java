package leetcode;

import java.util.Arrays;

/**
 * Created by DB_BOY on 2019/3/20.
 */

/*
Given an array of integers A sorted in non-decreasing order,

return an array of the squares of each number, also in sorted non-decreasing order.

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]

Note:

1 <= A.length <= 10000
-10000 <= A[i] <= 10000
A is sorted in non-decreasing order.


输入一个非递减的排序数组，返回一个非递减的，对每个元素求平方的数组
 */

public class SquaresofaSortedArray_977 {

    public static void main(String[] arrays) {
        int[] A = {-7, -3, 2, 2, 3, 11};

        A = solution1(A);
        for (int i : A) {
            System.out.print(i + "  ");
        }
    }

    private static int[] solution(int[] A) {

        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }
        Arrays.sort(A);

        return A;
    }


    private static int[] solution1(int[] A) {

        int size = A.length;
        if (size == 1) {
            A[0] = A[0] * A[0];
            return A;
        }

        /*
           首位对比，大的放入数组末尾。
           移动下标。
         */
        int i = 0, j = size - 1;
        int[] result = new int[size];
        int e = j;
        while (i <= j) {
            result[e--] = A[i] * A[i] > A[j] * A[j] ? A[i] * A[i++] : A[j] * A[j--];
        }
        return result;
    }
}
