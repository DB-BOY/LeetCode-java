package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DB_BOY on 2017/6/30.
 */
public class Test {

    private static class Bean{
        public Bean(String name,int age){
            this.name = name;
            this.age = age;
        }
        private String name;
        private int age;
    }

    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        list.add("a");
        list.add("b");
        List list2 = list;
        Test.Bean bean = new Test.Bean("fuck",2);
        System.out.println(bean);
        list2.add(bean);
        for (int i= 0 , length = list2.size();i<length;i++) {
            System.out.println(list2.get(i));
        }
    }
}
