package leetcode;

import utils.TreeNode;

/**
 * Created by DB_BOY on 2018/10/17.
 *   104	Maximum Depth of Binary Tree  
 */
public class MaximumDepthofBinaryTree_104 {

    public static void main(String[] arrays) {

        TreeNode t1 = new TreeNode(1);
        TreeNode t1l = new TreeNode(3);
        t1.left = t1l;
        TreeNode t1r = new TreeNode(2);
        t1.right = t1r;
        t1l.left = new TreeNode(31);
        t1r.left = new TreeNode(21);
        t1r.right = new TreeNode(22);
        System.out.println(maxDepth(t1));
    }

    public static int maxDepth(TreeNode root) {
        int depth = 0;
        if (root != null) {
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            depth++;
            depth = (leftDepth < rightDepth) ? (depth + rightDepth) : (depth + leftDepth);
        }
        return depth;
    }
}
