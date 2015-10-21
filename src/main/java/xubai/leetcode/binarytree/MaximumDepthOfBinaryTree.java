package xubai.leetcode.binarytree;

import xubai.model.TreeNode;

import java.util.Stack;

/**
 * Given a binary tree, find its maximum height.
 *
 * Created by xubai on 15/10/21.
 */
public class MaximumDepthOfBinaryTree {
    /**
     * 递归
     *
     * @param root
     * @return
     */
    public int maximumDepthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maximumDepthOfBinaryTree(root.getLeft());
        int right = maximumDepthOfBinaryTree(root.getRight());
        return Math.max(left, right) + 1;
    }

    /**
     * 非递归
     *
     * 从递归方法看，类似一个后序遍历过程。
     * 非递归方法也采用后序遍历的方式，记录遍历每个结点时栈的长度，
     * 其中最大值即为最大深度。
     *
     * @param root
     * @return
     */
    public int maximumDepthOfBinaryTree1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        TreeNode pre = null;
        while (!stack.isEmpty()) {
            TreeNode curr = stack.peek();
            if (pre == null || pre.getLeft() == curr || pre.getRight() == curr) {
                if (curr.getLeft() != null) {
                    stack.push(curr.getLeft());
                } else if (curr.getRight() != null) {
                    stack.push(curr.getRight());
                } else {
                    stack.pop();
                }
            } else if (pre == curr.getLeft()) {
                if (curr.getRight() != null) {
                    stack.push(curr.getRight());
                } else {
                    stack.pop();
                }
            } else if (pre == curr.getRight()) {
                stack.pop();
            }
            max = Math.max(max, stack.size());
            pre = curr;
        }
        return max;
    }
}
