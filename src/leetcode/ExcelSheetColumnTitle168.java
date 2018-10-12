package leetcode;

/**
 * Created by DB_BOY on 2018/10/11.
 * 类似题目 171
 */

/*
    Given a positive integer, return its corresponding column title as appear in an Excel sheet.

    For example:

        1 -> A
        2 -> B
        3 -> C
        ...
        26 -> Z
        27 -> AA
        28 -> AB
        ...
    Example 1:

    Input: 1
    Output: "A"
    Example 2:

    Input: 28
    Output: "AB"
    Example 3:

    Input: 701
    Output: "ZY"
 */

public class ExcelSheetColumnTitle168 {

    public static void main(String[] arrays){
        System.out.println(solution(701));
    }
    private static String solution(int n){
        StringBuilder result = new StringBuilder();
        if(n<27){
            result.append((char) ((n-1)+'A'));
        }else {
            while(n>0){
                result.insert(0,(char) ((n-1)%26+'A'));
                n = (n-1)/26;
            }
        }
        return result.toString();
    }
}
