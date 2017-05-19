package leetcode;

import java.util.ArrayList;

/**
 * Created by DB_BOY on 2017/5/19.
 */
public class KeyboardRow500 {
    private static String row1 = "qwertyuiop";
    private static String row2 = "asdfghjkl";
    private static String row3 = "zxcvbnm";

    public static void main(String[] args) {
        String[] word1 = new String[0];


for (String s : ja(word1)){

    System.out.println(s);
}


    }


    public static String[] ja(String[] words) {
        if (words == null || words.length <= 0) {
            return words;
        }
        String[] results  ;
        ArrayList<String > ls = new ArrayList<>();
        int result = 0, row = 0, tmp = 0;
        boolean isTrue;
        String tmpStr,word1;
        Character c;
        for (int m = 0,n = words.length;m<n;m++){
            word1 = words[m];
            tmpStr = word1.toLowerCase();
            result = 0;
            isTrue = false;
            if(tmpStr.length()==1){
                isTrue = true;
            }else{
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
                    System.out.println("tmp: "+tmp+ "  result: "+result);
                    if (result != tmp) {
                        isTrue = false;
                        break;
                    }else {
                        isTrue = true;
                    }
                }
            }
            if(isTrue){
                ls.add(word1);
            }
        }
        results= new String[ls.size()];
        return ls.toArray(results) ;
    }
}
