package leetcode;

import java.util.Arrays;

/**
 * Created by DB_BOY on 2018/9/29.
 * 反转图像
 */
public class FlippingAnImage_832 {
    public static void main(String[] args) {
        int[][] a = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        print(a);
        System.out.println("----------");
        print(solution(a));
    }

    private static int[][] solution(int[][] A) {
//        int tmp ;
        int count, end;
        for (int[] ints : A) {
            count = ints.length;
            end = count - 1;
            for (int i = 0; i < count / 2; i++) {
//                tmp = ints[i];
//                ints[i] = ints[end-i];
//                ints[end-i] = tmp;
//
                ints[i] = ints[i] ^ ints[end - i];
                ints[end - i] = ints[i] ^ ints[end - i];
                ints[i] = ints[i] ^ ints[end - i];
//
//                ints[i] = ints[i] ^ 1;
//                if (count % 2 == 0)
//                    ints[end - i] = ints[end - i] ^ 1;
            }
            for (int i = 0; i < ints.length; i++) {
                ints[i] = ints[i] ^ 1;
            }
        }


        for (int i = 0; i < A.length; i++) {
            
        }
        
        
        return A;
    }

    private static void print(int[][] a) {
        for (int[] ints : a) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
