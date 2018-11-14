package leetcode;

/**
 * Created by DB_BOY on 2018/11/14.
 */
//查找数字插入位置
public class SearchInsertPosition_135 {

    public static void main(String[] arrays) {
        System.out.println(solution(new int[]{1, 3, 5, 6}, 7));
    }

    private static Object solution(int[] nums, int target) {

        // for (int i = 0; i < nums.length; i++) {
        //     if(nums[i]==target || (nums[i]>target)){
        //         return i;
        //     }
        // }
        // return nums.length;
        //类二分查找优化
        if (nums == null || nums.length < 1) {
            return -1;
        }
        int index = 0, end = nums.length - 1, start;
        while (true) {
            if (target <= nums[index]) {
                return index;
            }
            if (target > nums[end]) {
                return end + 1;
            }
            start = (index + end) / 2;
            if (target > nums[start]) {
                index = start + 1;
            } else {
                end = start;
            }
        }
    }
}
