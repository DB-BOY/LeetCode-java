package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DB_BOY on 2018/11/6.
 */
public class PositionofLargeGroups_830 {

    public static void main(String[] arrays) {
        System.out.println(solution("abbxxxxzzy"));
        System.out.println(solution("abcdddeeeeaabbbcd"));
        System.out.println(solution("abcd"));
        System.out.println(solution("aaa"));
    }

    private static List<List<Integer>> solution(String S) {
        List<List<Integer>> result = new ArrayList<>();
        int index = 0;
        List<Integer> sub;
//        char c = '.',t;
//        for (int i = 0; i <= S.length(); i++) {
        //
        //    t = S.charAt(i);
        //            if(c=='.'){
        //        c=t;
        //    }
        //            if(c!=t){
        //        if(count>=3){
        //            sub = new ArrayList<>();
        //            sub.add(index);
        //            sub.add(index+count-1);
        //            result.add(sub);
        //        }
        //        c = t;
        //        index = i;
        //        count=1;
        //    }else{
        //        count++;
        //    }
        //}
        //        if(count>=3){
        //                sub = new ArrayList<>();
        //        sub.add(index);
        //        sub.add(index+count-1);
        //        result.add(sub);
        //        }
//        }
        for (int i = 0; i <= S.length(); i++) {
            //i==length 拦截 aaa
            //charAt(i)  charAt(index) 判断相等，代替之前 变量c每次赋值操作。
            if (i == S.length() || S.charAt(i) != S.charAt(index)) {
                if (i - index >= 3) {
                    sub = new ArrayList<>();
                    sub.add(index);
                    sub.add(i - 1);
                    result.add(sub);
                }
                index = i;
            }
        }
        return result;
    }


}
