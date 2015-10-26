package xubai.leetcode.binarytree;

import java.util.Stack;

import xubai.model.TreeNode;

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * 
 * Assume a BST is defined as follows:
 * 
 * The left subtree of a node contains only nodes with keys less than the node's key. The right
 * subtree of a node contains only nodes with keys greater than the node's key. Both the left and
 * right subtrees must also be binary search trees.
 * 
 * Created by xubai on 15/10/26.
 */
public class ValidateBinarySearchTree {
    /**
     * 递归
     *
     * min和max使用long型是因为，如果使用int，当结点的值为int的最大值或最小值时，会出现错误。
     *
     * @param root
     * @return
     */
    public boolean validateBinarySearchTree(TreeNode root) {
        return validateBinarySearchTree(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validateBinarySearchTree(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.getValue() <= min || root.getValue() >= max) {
            return false;
        }
        return validateBinarySearchTree(root.getLeft(), min, root.getValue())
                && validateBinarySearchTree(root.getRight(), root.getValue(), max);
    }

    /**
     * 非递归，采用中序遍历
     *
     * @param root
     * @return
     */
    public boolean validateBinarySearchTree1(TreeNode root) {
        if (root == null) {
            return true;
        }
        long min = Long.MIN_VALUE;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.getLeft();
            } else {
                node = stack.pop();
                if (node.getValue() <= min) {
                    return false;
                }
                min = node.getValue();
                node = node.getRight();
            }
        }
        return true;
    }
}
