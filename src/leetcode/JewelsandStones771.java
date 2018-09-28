package leetcode;

/**
 * Created by DB_BOY on 2018/9/28.
 */
public class JewelsandStones771 {
    public static void main(String[] args) {
        System.out.println(System.nanoTime());
        String  j = "aA";
        String  s = "aAAbbbbbb";
        System.out.println(numJewelsInStones(j,s));
        System.out.println(System.nanoTime());
        j = "z";
        s ="ada";
        System.out.println(numJewelsInStones(j,s));
        System.out.println(System.nanoTime());
    }

    public static int numJewelsInStones(String J, String S) {
        if(J==null|| J.length()<1){
            return 0;
        }
        if(S==null|| S.length()<1){
            return 0;
        }
        char[] ss = S.toCharArray();
        int count=0;

        for (char c : ss){
            if(J.indexOf(c)>=0)
                count++;
        }
        return count;
    }
}
