package leetcode;

/**
 * Created by DB_BOY on 2018/10/10.
 */
/*
给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

示例 1:

输入: "Let's take LeetCode contest"
输出: "s'teL ekat edoCteeL tsetnoc"
注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
public class ReverseWordsinAStringIII_557 {

    public static void main(String[] arrays) {
        System.out.println(solution("Let's take LeetCode contest"));
    }

    private static String solution(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb, sb2 = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            sb = new StringBuilder(strs[i]);
            sb2.append(sb.reverse().toString()).append(" ");
        }
        sb2.delete(sb2.length() - 1, sb2.length());
        return sb2.toString();
    }
}
