package xubai.leetcode.binarytree;

import java.util.LinkedList;

import xubai.model.TreeNode;

/**
 * Given a binary tree, find its minimum depth.
 * 
 * Created by xubai on 15/10/21.
 */
public class MinimumDepthOfBinaryTree {
    /**
     * 递归
     *
     * @param root
     * @return
     */
    public int minimumDepthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = minimumDepthOfBinaryTree(root.getLeft());
        int right = minimumDepthOfBinaryTree(root.getRight());
        return Math.min(left, right) + 1;
    }

    /**
     * 非递归
     *
     * 采用层次遍历的方式，如果遇到某层出现叶子结点，该层次的高度即为最小高度。
     *
     * @param root
     * @return
     */
    public int minimumDepthOfBinaryTree1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int result = 1;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            TreeNode node = queue.pop();
            if (node == null && !queue.isEmpty()) {
                result++;
                queue.add(null);
            } else {
                if (node.getLeft() == null && node.getRight() == null) {
                    break;
                }
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }
        }
        return result;
    }
}
