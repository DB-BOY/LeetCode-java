package leetcode;

/**
 * Created by DB_BOY on 2018/10/24.
 * 重构数组
 */
/*
    In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

    You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

    The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

    If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

    Example 1:
    Input:
    nums =
    [[1,2],
     [3,4]]
    r = 1, c = 4
    Output:
    [[1,2,3,4]]
    Explanation:
    The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
    Example 2:
    Input:
    nums =
    [[1,2],
     [3,4]]
    r = 2, c = 4
    Output:
    [[1,2],
     [3,4]]
    Explanation:
    There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.
    Note:
    The height and width of the given matrix is in range [1, 100].
    The given r and c are all positive.
 */
public class ReshapeTheMatrix_566 {

    public static void main(String[] arrays) {
        int[][] a = new int[][]{
                {1, 2, 3}
                , {4, 5, 6}
        };
        System.out.println(solution(a, 3, 2));
    }

    private static int[][] solution(int[][] nums, int r, int c) {
        int row = nums.length;
        int column = nums[0].length;
        int n = row * column;

        //当原数组元素的个数与新数组元素个数相等，转换
        if (n != r * c || (r == row && c == column)) {
            return nums;
        } else {
            int[][] result = new int[r][c];
            for (int i = 0; i < n; i++) {
                result[i / c][i % c] = nums[i / column][i % column];
            }
            return result;
        }
    }
}
