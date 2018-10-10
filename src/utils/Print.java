package utils;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by DB_BOY on 2018/9/26.
 */
public class Print {
    public static void print(Object[] t){
        System.out.println(Arrays.toString(t));
    }
    public static void print(int[] t){
        System.out.println(Arrays.toString(t));
    }
    public static void print(String t){
        System.out.println(t);
    }

    // 层次遍历二叉树
    public static void levelTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList list = new LinkedList();
        list.add(root);
        while (list.size() != 0) {
            TreeNode node = (TreeNode) list.removeFirst(); // list.removeFirst() 该方法LinkedList才有
            System.out.print(node.val + " ");
            if(node.left != null) {
                list.add(node.left);
            }
            if(node.right != null) {
                list.add(node.right);
            }
        }
    }
}
