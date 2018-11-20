package leetcode;

/**
 * Created by DB_BOY on 2018/11/20.
 */
public class ValidMountainArray_941 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{0, 3, 5, 4, 3}));
    }

    private static Object solution(int[] A) {
//        if(A ==null) return false;
//        int length  = A.length;
//        if(length<3) return false;
//        int i,j;
//        for( i =0,j=length-1;i<j;){
//            if(A[i]<A[i+1]){
//                i++;
//            } else if(A[j]<A[j-1]){
//                j--;
//            }else{
//                return false;
//            }
//        }
//        return i==j && i>0 && j<length-1;
        int i = 0, length = A.length;
        if (length < 3) return false;
        while (i + 1 < length && A[i] < A[i + 1]) {
            i++;
        }
        if (i == 0 || i == length) {
            return false;
        }

        while (i + 1 < length && A[i] > A[i + 1]) {
            i++;
        }

        return i == length - 1;

    }
}
