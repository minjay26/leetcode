package org.minjay.leetcode.middleofthelinkedlist;

public class Test {

    public static void main(String[] args) {

    }


    public static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
