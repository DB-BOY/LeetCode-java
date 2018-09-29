package leetcode;

import java.util.Arrays;

/**
 * Created by DB_BOY on 2018/9/29.
 */
public class SortArrayByParity905 {
    public static void main(String[] args) {
        int[] a = {3, 6};
        System.out.println(Arrays.toString(sortArrayByParity(a)));
        a =new int[] {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(sortArrayByParity(a)));
        a =new int[] {1,2,3,4};
        System.out.println(Arrays.toString(sortArrayByParity(a)));

    }

    public static int[] sortArrayByParity(int[] A) {
        int start = 0;
        int count = A.length;
        int left = 0, right = count - 1;
        int end = right;
        int[] result = new int[count];

//        for (int i : A) {
//            1.
//            if (i%2==0){
//                result[index++]=i;
//            }else {
//                result[--count] = i;
//            }
//            2.
//            result[(i%2==0)?(index++):(--count)]=i;
//        }
//            3.折半
        while (left < right) {
            if (A[left] % 2 == 0) {
                result[start++] = A[left];
            } else {
                result[end--] = A[left];
            }
            left++;
            if (A[right] % 2 == 0) {
                result[start++] = A[right];
            } else {
                result[end--] = A[right];
            }
            right--;
        }
        if (count % 2 != 0) {
            result[start] = A[left];
        }
        return result;

    }
}
