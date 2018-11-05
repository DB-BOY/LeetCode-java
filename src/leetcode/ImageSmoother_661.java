package leetcode;


/**
 * Created by DB_BOY on 2018/11/5.
 */
public class ImageSmoother_661 {


    public static void main(String[] arrays) {
        int[][] m = solution(new int[][]{
                {2, 3, 4},
                {5, 6, 7},
                {8, 9, 10},
                {11, 12, 13},
                {14, 15, 16}
        });
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static int[][] solution(int[][] M) {

        int row = M.length, column = M[0].length;
        if (row < 2 || column < 2) {
            return M;
        }

        int[][] result = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = getAverage(M, i, j, row, column);
            }
        }
        return result;
    }

    public static int getAverage(int[][] m, int i, int j, int row, int column) {
        int sum = 0, count = 0;

        //上一行
        if (i - 1 > -1) {
            sum += m[i - 1][j];
            count++;

            if (j - 1 > -1) {
                sum += m[i - 1][j - 1];
                count++;

            }
            if (j + 1 < column) {
                sum += m[i - 1][j + 1];
                count++;
            }
        }
        //下一行
        if (i + 1 < row) {
            sum += m[i + 1][j];
            count++;

            if (j - 1 > -1) {
                sum += m[i + 1][j - 1];
                count++;
            }
            if (j + 1 < column) {
                sum += m[i + 1][j + 1];
                count++;
            }
        }
        //同行
        if (j - 1 > -1) {
            sum += m[i][j - 1];
            count++;
        }
        if (j + 1 < column) {
            sum += m[i][j + 1];
            count++;
        }
        sum += m[i][j];
        count++;

        int result = (int) Math.floor((sum * 1d) / count);
        return result;
    }
}