package leetcode;

import utils.TreeNode;

/**
 * Created by DB_BOY on 2018/10/9.
 * 反转二叉树
 */
public class InvertBinaryTree226 {

    public static void main(String[] arrays) {
        /*
                1
               3  2
            31  21 22
         */
        TreeNode t1 = new TreeNode(1);
        TreeNode t1l = new TreeNode(3);
        t1.left = t1l;
        TreeNode t1r = new TreeNode(2);
        t1.right = t1r;
        t1l.left = new TreeNode(31);
        t1r.left = new TreeNode(21);
        t1r.right = new TreeNode(22);
        print(t1);
        System.out.println();
        print(solution(t1));
    }

    private static TreeNode solution(TreeNode root) {
        if (root == null) {
            return null;
        } else if ((root.left == null) && (root.right == null)) {
            return root;
        } else{
            TreeNode temp = root.left;
            root.left = solution(root.right);
            root.right = solution(temp);
            return root;
        }
    }

    private static void print(TreeNode t) {
        if (t == null) return;
        System.out.println(t.val);
        print(t.left);
        print(t.right);
    }
}
