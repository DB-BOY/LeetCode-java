package leetcode;

import java.util.Arrays;

/**
 * Created by DB_BOY on 2018/9/29.
 */
public class SortArrayByParity905 {
    public static void main(String[] args) {
        int[] a = {1,2};
        System.out.println(Arrays.toString(sortArrayByParity(a)));
    }
    public static int[] sortArrayByParity(int[] A) {
        int index = 0;
        int count = A.length;
        int[] result = new int[count];

        for (int i : A) {
//            result[(i%2==0)?(index++):(--count)]=i;

            if (i%2==0){
                result[index++]=i;
            }else {
                result[--count] = i;
            }
        }
        return result;

    }
}
