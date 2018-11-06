package leetcode;

/**
 * Created by gin on 2018/11/6.
 */
public class MissingNumbers_268 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{3, 0, 2, 1, 4, 5, 6, 7, 9}));
//        int[] s = new int[]{3,0,2,1,4,5,6,7,9};
//
//        int sumI=0,sumS=0;
//        for(int i=0;i<s.length;i++){
//            sumI +=i;
//            sumS +=s[i];
//        }
//        System.out.println(sumI-sumS);
//        System.out.println(sumI-sumS +s.length);

    }

    private static int solution(int[] nums) {

        if (nums == null || nums.length < 1) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += i - nums[i];
        }
        return sum + nums.length;
    }
}
