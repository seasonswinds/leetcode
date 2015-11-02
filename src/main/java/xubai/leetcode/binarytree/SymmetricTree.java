package xubai.leetcode.binarytree;

import xubai.model.TreeNode;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * 
 * For example, this binary tree is symmetric:
 * 
 *      1
 *    /   \
 *   2    2
 *  / \  / \
 * 3  4 4  3
 * 
 * But the following is not:
 * 
 *    1
 *  /  \
 * 2   2
 *  \   \
 *  3   3
 * 
 * Created by xubai on 15/11/2.
 */
public class SymmetricTree {
    public boolean symmetricTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        return symmetricTree(root.getLeft(), root.getRight());
    }

    private boolean symmetricTree(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.getValue() != right.getValue()) {
            return false;
        }
        return symmetricTree(left.getLeft(), right.getRight()) && symmetricTree(left.getRight(), right.getLeft());
    }
}
