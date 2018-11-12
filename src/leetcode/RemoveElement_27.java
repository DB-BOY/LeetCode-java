package leetcode;

/**
 * Created by DB_BOY on 2018/11/12.
 */
public class RemoveElement_27 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
        int[] nums = new int[]{3, 2, 2, 3};
        int len = solution(nums, 3);

        System.out.println(len);

        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }
    }

    private static int solution(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length - index; i++) {
            if (nums[i] == val) {
                index++;
                nums[i] = nums[nums.length - index];
                i--;
            }
        }
        return nums.length - index;
    }
}
