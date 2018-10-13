package leetcode;

import utils.ListNode;

/**
 * Created by DB_BOY on 2018/10/12.
 */
/*
    Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

    Given linked list -- head = [4,5,1,9], which looks like following:

        4 -> 5 -> 1 -> 9
    Example 1:

    Input: head = [4,5,1,9], node = 5
    Output: [4,1,9]
    Explanation: You are given the second node with value 5, the linked list
                 should become 4 -> 1 -> 9 after calling your function.
    Example 2:

    Input: head = [4,5,1,9], node = 1
    Output: [4,5,9]
    Explanation: You are given the third node with value 1, the linked list
                 should become 4 -> 5 -> 9 after calling your function.
    Note:

    The linked list will have at least two elements.
    All of the nodes' values will be unique.
    The given node will not be the tail and it will always be a valid node of the linked list.
    Do not return anything from your function.
 */
public class DeleteNodeinaLinkedList237 {

    public static void main(String[] arrays) {
        ListNode node = new ListNode(4);
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(9);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        solution(node);
        print(node);
    }

    private static void solution(ListNode node) {
        if (node == null) {
            return;
        }
        if (node.next == null) {
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void print(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
