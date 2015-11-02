package xubai.leetcode.binarytree;

import xubai.model.TreeNode;

/**
 * Given two binary trees, write a function to check if they are equal or not.
 * 
 * Two binary trees are considered equal if they are structurally identical and the nodes have the
 * same value.
 * 
 * Created by xubai on 15/11/2.
 */
public class SameTree {
    public boolean sameTree(TreeNode rootA, TreeNode rootB) {
        if (rootA == null && rootB == null) {
            return true;
        }
        if (rootA == null) {
            return false;
        }
        if (rootB == null) {
            return false;
        }
        if (rootA.getValue() != rootB.getValue()) {
            return false;
        }
        return sameTree(rootA.getLeft(), rootB.getLeft()) && sameTree(rootA.getRight(), rootB.getRight());
    }
}
