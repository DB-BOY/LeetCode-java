package leetcode;

import java.util.Arrays;

/**
 * Created by DB_BOY on 2018/11/19.
 */
public class MergeSortArray_88 {

    public static void main(String[] arrays) {
        solution(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{4, 5, 6}, 3);
    }

    private static void solution(int[] nums1, int m, int[] nums2, int n) {

        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {

            if (nums1[i] > nums2[j]) {
                result[k++] = nums2[j++];
            } else {
                result[k++] = nums1[i++];
            }
        }
        while (i < m) {
            result[k++] = nums1[i++];
        }
        while (j < n) {
            result[k++] = nums2[j++];
        }
        System.out.println(Arrays.toString(result));
        System.arraycopy(result, 0, nums1, 0, m + n);
        System.out.println(Arrays.toString(nums1) + " " + Arrays.toString(result));
    }
}
