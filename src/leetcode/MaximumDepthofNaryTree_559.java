package leetcode;

import utils.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gin on 2018/10/13.
 */
/*
    给定一个 N 叉树，找到其最大深度。

    最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。

    例如，给定一个 3叉树 :


    我们应返回其最大深度，3。

    说明:

    树的深度不会超过 1000。
    树的节点总不会超过 5000。
 */
public class MaximumDepthofNaryTree_559 {

    public static void main(String[] arrays) {

        Node child11 = new Node(11, null);
        Node child12 = new Node(12, null);

        Node child21 = new Node(21, null);

        ArrayList ll = new ArrayList<>();
        ll.add(new Node(222, null));

        Node child22 = new Node(22, ll);
        ll = new ArrayList<>();
        ll.add(child11);
        ll.add(child12);
        Node child1 = new Node(1, ll);

        ll = new ArrayList<>();
        ll.add(child21);
        ll.add(child22);
        Node child2 = new Node(2, ll);

        ll = new ArrayList<>();
        ll.add(child1);
        ll.add(child2);
        Node root = new Node(10, ll);

        System.out.println(solution(root));
    }

    private static int solution(Node root) {
        if (root == null) return 0;
        List<Node> children = root.children;
        if (children == null || children.size() < 1) {
            return 1;
        }

        int count = 1;
        for (Node child : children) {
            count = Math.max(count, solution(child) + 1);
        }
        return count;
    }
}