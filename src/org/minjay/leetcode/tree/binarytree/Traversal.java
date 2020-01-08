package org.minjay.leetcode.tree.binarytree;

import java.util.Stack;

public class Traversal {

    public static final TreeNode root;

    static {
        root = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node8 = new TreeNode(8);
        root.left = node2;
        root.right = node8;

        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        node2.left = node1;
        node2.right = node3;

        TreeNode node6 = new TreeNode(6);
        TreeNode node9 = new TreeNode(9);
        node8.left = node6;
        node8.right = node9;

        TreeNode node5 = new TreeNode(5);
        TreeNode node7 = new TreeNode(7);
        node6.left = node5;
        node6.right = node7;

        TreeNode node10 = new TreeNode(10);
        node9.right = node10;
    }

    public static void main(String[] args) {
        //recursiveDLR(root);
        // noRecursiveDLR(root);
        // recursiveLDR(root);
        //noRecursiveLDR(root);
        // recursiveLRD(root);
        noRecursiveLRD(root);
    }

    /**
     * 递归先序遍历
     *
     * @param root
     */
    public static void recursiveDLR(TreeNode root) {
        if (root != null) {
            System.out.println(root.value + "->");
            recursiveDLR(root.left);
            recursiveDLR(root.right);
        }
    }

    /**
     * 非递归先序遍历
     *
     * @param root
     */
    public static void noRecursiveDLR(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            if (root != null) {
                System.out.println(root.value + "->");
                stack.push(root);
                root = root.left;
            } else {
                TreeNode temp = stack.pop();
                root = temp.right;
            }
        }
    }

    /**
     * 递归中序遍历
     *
     * @param root
     */
    public static void recursiveLDR(TreeNode root) {
        if (root != null) {
            recursiveLDR(root.left);
            System.out.println(root.value + "->");
            recursiveLDR(root.right);
        }
    }

    /**
     * 非递归先序遍历
     *
     * @param root
     */
    public static void noRecursiveLDR(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode temp = stack.pop();
                System.out.println(temp.value + "->");
                root = temp.right;
            }
        }
    }

    /**
     * 递归后序遍历
     *
     * @param root
     */
    public static void recursiveLRD(TreeNode root) {
        if (root != null) {
            recursiveLRD(root.left);
            recursiveLRD(root.right);
            System.out.println(root.value + "->");
        }
    }

    /**
     * 非递归后序遍历
     *
     * @param root
     */
    public static void noRecursiveLRD(TreeNode root) {
        TreeNode cur, pre = null;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            cur = stack.peek();
            if ((cur.left == null && cur.right == null) || (pre != null && (pre == cur.left || pre == cur.right))) {
                System.out.print(cur.value + "->");
                stack.pop();
                pre = cur;
            } else {
                if (cur.right != null)
                    stack.push(cur.right);
                if (cur.left != null)
                    stack.push(cur.left);
            }
        }
    }


}
