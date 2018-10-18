package leetcode;

import utils.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DB_BOY on 2018/10/18.
 */
/*
    590.N叉树的后续遍历
    Given an n-ary tree, return the postorder traversal of its nodes' values.


    For example, given a 3-ary tree:
                1
             3  2  4
            5 6

    Return its postorder traversal as: [5,6,3,2,4,1].

 */
public class NaryTreepostordertraversal_590 {

    public static void main(String[] arrays) {
        Node child11 = new Node(5, null);
        Node child12 = new Node(6, null);

        ArrayList ll = new ArrayList<>();
        ll.add(child11);
        ll.add(child12);
        Node child1 = new Node(3, ll);

        Node child2 = new Node(2, null);
        Node child3 = new Node(4, null);

        ll = new ArrayList<>();
        ll.add(child1);
        ll.add(child2);
        ll.add(child3);
        Node root = new Node(1, ll);

        System.out.println(solution(root));
    }

    private static List<Integer> solution(Node root) {
        return null;
    }
}
