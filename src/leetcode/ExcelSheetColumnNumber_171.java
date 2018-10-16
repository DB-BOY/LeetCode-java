package leetcode;

/**
 * Created by DB_BOY on 2018/10/11.
 *
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 */
/*
    例如，
        A -> 1
        B -> 2
        C -> 3
        ...
        Z -> 26
        AA -> 27
        AB -> 28
        ...
    示例 1:

    输入: "A"
    输出: 1
    示例 2:

    输入: "AB"
    输出: 28
    示例 3:

    输入: "ZY"
    输出: 701
 */
public class ExcelSheetColumnNumber_171 {

    public static void main(String[] arrays){
        System.out.println(solution("ZY"));
    }
    private static int solution(String s){
        if(s==null||s.length()<1)
            return 0;
        //类似进制转换   s-'A'+1
        //A 1
        int sum =0 ,tmp = 0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
                tmp = aChar-'A'+1;
                sum = 26*sum+tmp;
        }
        return sum;
    }
}
