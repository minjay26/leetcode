package org.minjay.leetcode.reverselinkedlistii;

import java.util.Stack;

/**
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * <p>
 * 说明:
 * 1 ≤ m ≤ n ≤ 链表长度。
 * <p>
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
 * 输出: 1->4->3->2->5->NULL
 */
public class Solution {

    public static ListNode node1 = new ListNode(1);

    public static void main(String[] args) {
        solute(node1, 2, 4);
    }

    static {
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;
        node5.next = null;
    }

    public static ListNode solute(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for (int i = 1; i < m; i++) {
            pre = pre.next;
        }
        head = pre.next;
        for (int i = m; i < n; i++) {
            ListNode nex = head.next;
            head.next = nex.next;
            nex.next = pre.next;
            pre.next = nex;
        }
        return dummy.next;
    }

    public static ListNode solute2(ListNode node, int m, int n, int count, Stack<ListNode> stack) {
        if (m <= count & count <= n) {
            stack.push(node);
            count++;
            return null;
        } else if (count > n) {
            return new ListNode(0);
        } else {
            count++;
            return node;
        }
    }
}
