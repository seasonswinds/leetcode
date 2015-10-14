package xubai.leetcode.binarytree;

import xubai.model.TreeNode;

/**
 * Given a binary tree, determine if it is height-balanced.
 * 
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of
 * the two subtrees of every node never differ by more than 1.
 *
 * Created by xubai on 15/10/14.
 */
public class BalancedBinaryTree {
    /**
     * 递归求出每个结点的左右子树的高度差，只要有一个结点左右子树的高度差大于1，则该树不平衡
     * 由于求树高度也是递归过程，如果直接求一个结点2个子树的高度，再求差判断是否大于一，则需要2轮递归。
     * 可以采用-1（树高度不可能为-1）保存该结点的2个子树不平衡的状态，这样递归一轮即可。
     *
     * @param root
     * @return
     */
    public boolean balancedBinaryTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (getHeight(root) == -1) {
            return false;
        }
        return true;
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getHeight(root.getLeft());
        int right = getHeight(root.getRight());
        if (left == -1 || right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}
