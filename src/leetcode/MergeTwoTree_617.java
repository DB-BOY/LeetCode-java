package leetcode;

import utils.Print;
import utils.TreeNode;

/**
 * Created by DB_BOY on 2018/9/29.
 * 合并二叉树
 */


        /* 输入:
        *      Tree 1                     Tree 2
        *          1                          2
        *         / \                       /  \
        *       3   2                      1   3
        *      /                           \    \
        *     5                            4    7
        * 输出:
        * 合并后的树:
        *              3
        *             / \
        *            4   5
        *           / \   \
        *          5   4   7
        *
        */


public class MergeTwoTree_617 {

    private static void print(TreeNode t) {
        if (t==null )return;
        System.out.println(t.val);
        print(t.left);
        print(t.right);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        solution(t1, t2);
        print(t1);
        System.out.println();
        Print.levelTraverse(t2);


    }

    private static TreeNode solution(TreeNode t1, TreeNode t2) {

        if (t1 == null && t2 == null) {
            return null;
        } else if (t1 == null) {
            return t2;
        } else if (t2 == null) {
            return t1;
        } else {
            t1.val += t2.val;
            t1.left = solution(t1.left, t2.left);
            t1.right = solution(t1.right, t2.right);
            return t1;
        }
    }


}
