package leetcode;

/**
 * Created by DB_BOY on 2018/11/16.
 */
public class RemoveDuplicatesfromSortedArray_26 {

    public static void main(String[] arrays) {
        int[] nums = new int[]{-1, 0, 0, 0, 0, 0, 3};
        int len = solution(nums);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }

    }

    private static int solution(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int tmp = Integer.MIN_VALUE, index = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != tmp) {
                tmp = nums[i];
                nums[index++] = nums[i];
                count++;
            }
        }
        return count;
    }
}
