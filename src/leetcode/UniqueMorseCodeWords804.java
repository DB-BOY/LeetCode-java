package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DB_BOY on 2018/10/9.
 * 唯一摩尔斯密码词
 */
public class UniqueMorseCodeWords804 {

    public static void main(String[] arrays) {
        String [] words = {"gin", "zen", "gig", "msg"};
        System.out.println(solution(words));
    }

    private static int solution(String [] words) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        StringBuilder newStr;
        char[] chars;
        Map<String,Integer> map = new HashMap<>();
        for(String word :words){
            chars = word.toCharArray();
            newStr= new StringBuilder();
            for (char c : chars){
                newStr.append( morse[c-'a']);
            }
            map.put(newStr.toString(),1);
        }
        return map.size();
    }
}
