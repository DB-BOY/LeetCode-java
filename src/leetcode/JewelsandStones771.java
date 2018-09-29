package leetcode;

/**
 * Created by DB_BOY on 2018/9/28.
 */
public class JewelsandStones771 {
    public static void main(String[] args) {
        long start;
        System.out.println(start = System.currentTimeMillis());
        String  j = "aA";
        String  s = "aAAbbbbbb";
//        System.out.println(numJewelsInStones(j,s));
//        j = "z";
//        s ="ada";
//        System.out.println(numJewelsInStones(j,s));
//        j="";
//        s="sadasfdasf";
        System.out.println(numJewelsInStones(j,s));

        System.out.println(System.currentTimeMillis()-start);
    }

    public static int numJewelsInStones(String J, String S) {
        if(J==null||S==null|| S.length()<1){
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
