package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by DB_BOY on 2017/5/19.
 */
public class KeyboardRow_500 {
    private static String row1 = "qwertyuiop";
    private static String row2 = "asdfghjkl";
    private static String row3 = "zxcvbnm";

    public static void main(String[] args) {
        String[] word1 = {"adgg", "hello", "word"};
        for (String s : findWords(word1)) {
            System.out.println(s);
        }


    }

    public static String[] findWords(String[] words) {

        if (words == null || words.length <= 0) {
            return words;
        }
        Map<String, Integer> map = new HashMap<>();
        map.put("q", 1);
        map.put("w", 1);
        map.put("r", 1);
        map.put("e", 1);
        map.put("t", 1);
        map.put("y", 1);
        map.put("u", 1);
        map.put("i", 1);
        map.put("o", 1);
        map.put("p", 1);

        map.put("a", 4);
        map.put("s", 4);
        map.put("d", 4);
        map.put("f", 4);
        map.put("g", 4);
        map.put("h", 4);
        map.put("j", 4);
        map.put("k", 4);
        map.put("l", 4);

        map.put("z", 8);
        map.put("x", 8);
        map.put("c", 8);
        map.put("v", 8);
        map.put("b", 8);
        map.put("n", 8);
        map.put("m", 8);

        String[] results;
        ArrayList<String> ls = new ArrayList<>();
        int result = 0, row = 0, tmp = 0;
        boolean isTrue;
        String tmpStr, word1;
        Character c;
        for (int m = 0, n = words.length; m < n; m++) {
            word1 = words[m];
            tmpStr = words[m].toLowerCase();
            isTrue = true;
            c = tmpStr.charAt(0);
            row = map.get(c + "");
            result = row;
            for (int i = 1, j = tmpStr.length(); i < j; i++) {
                c = tmpStr.charAt(i);
                row = map.get(c + "");
                tmp = result & row;

                if (result != tmp) {
                    isTrue = false;
                    break;
                } else {
                    isTrue = true;
                }
            }
            if (isTrue) {
                ls.add(word1);
            }
        }
        results = new String[ls.size()];
        return ls.toArray(results);
    }


    public static String[] ja(String[] words) {
        if (words == null || words.length <= 0) {
            return words;
        }
        String[] results;
        ArrayList<String> ls = new ArrayList<>();
        int result = 0, row = 0, tmp = 0;
        boolean isTrue;
        String tmpStr, word1;
        Character c;
        for (int m = 0, n = words.length; m < n; m++) {
            word1 = words[m];
            tmpStr = word1.toLowerCase();
            result = 0;
            isTrue = false;
            if (tmpStr.length() == 1) {
                isTrue = true;
            } else {
                for (int i = 0, j = tmpStr.length(); i < j; i++) {
                    c = tmpStr.charAt(i);
                    if (row1.contains(c.toString())) {
                        row = 1;
                    } else if (row2.contains(c.toString())) {
                        row = 1 << 2;
                    } else if (row3.contains(c.toString())) {
                        row = 1 << 3;
                    } else {
                        row = 0;
                    }
                    if (i == 0) {
                        result = row;
                        tmp = result;
                    } else {
                        tmp = result & row;
                    }
                    System.out.println("tmp: " + tmp + "  result: " + result);
                    if (result != tmp) {
                        isTrue = false;
                        break;
                    } else {
                        isTrue = true;
                    }
                }
            }
            if (isTrue) {
                ls.add(word1);
            }
        }
        results = new String[ls.size()];
        return ls.toArray(results);
    }
}
