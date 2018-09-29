package leetcode;

/**
 * Created by DB_BOY on 2018/9/28.
 */
public class ToLowerCase709 {
    public static void main(String[] args) {
        String s = "hellO";
        System.out.println(toLowerCase(s));
        s = "hAAlO";
        System.out.println(toLowerCase(s));
        s = "heOOlO";
        System.out.println(toLowerCase(s));
        s = "ABD O";
        System.out.println(toLowerCase(s));
        s = "12345PPP";
        System.out.println(toLowerCase(s));
    }
    public static String toLowerCase(String str) {
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i]>='A'&&c[i]<='Z'){
                c[i]= (char) (c[i]+32);
            }
        }
        return new String(c);
    }
}
