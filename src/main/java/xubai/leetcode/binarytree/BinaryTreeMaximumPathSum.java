package xubai.leetcode.binarytree;

import xubai.model.TreeNode;

/**
 * Given a binary tree, find the maximum path sum. The path may start and end at any node in the
 * tree. For example, given the below binary tree
 * 
 *   1
 *  / \
 * 2  3
 *
 * the result is 6.
 * 
 * Created by xubai on 15/10/21.
 */
public class BinaryTreeMaximumPathSum {
    /**
     * 采用递归的方法，每次递归有2个值需要计算。
     *
     *       1
     *    /    \
     *   2     3
     *  / \   / \
     * 4  5  6  7
     *
     * 一个值是作为经过其父节点的路径的一部分时的最大值，
     * 这时父节点需要根据其中的大值来计算经过根节点的最大路径值。
     * 例如，结点1的右子树有3 -> 7和3 -> 6两条路径，取较大的3 -> 7，
     * 加上左子树的5 -> 2，再加上父节点后可组成5 -> 2 -> 1 -> 3 -> 7的一条路径。
     * 由于各节点值可能为负，经过父节点的最大路径有3种情况：
     * 根节点 + 左子树路径：5 -> 2 -> 1
     * 根节点 + 右子树路径：1 -> 3 -> 7
     * 左子树路径 + 根节点 + 右子树路径：5 -> 2 -> 1 -> 3 -> 7
     *
     * 由于有可能子树自己作为一颗独立的树时的最大路径和比经过父节点的路径最大值还要大。
     * 因此遍历每颗子树时还需要计算自己作为一颗独立的树时的最大路径和，
     * 例如：4 -> 2 -> 5，6 -> 3 -> 7。
     * 最后从每颗子树的最大路径和中找出一个最大值，就是整棵数的最大路径和。
     *
     * 这里采用一个只有一个元素的数组来记录各个子树路径和的最大值。
     *
     * @param root
     * @return
     */
    public int binaryTreeMaximumPathSum(TreeNode root) {
        int[] max = {Integer.MIN_VALUE};
        binaryTreeMaximumPathSum(root, max);
        return max[0];
    }

    private int binaryTreeMaximumPathSum(TreeNode root, int[] max) {
        if (root == null) {
            return 0;
        }
        int left = binaryTreeMaximumPathSum(root.getLeft(), max);
        int right = binaryTreeMaximumPathSum(root.getRight(), max);
        int current = Math.max(root.getValue(), Math.max(left, right) + root.getValue());
        max[0] = Math.max(max[0], Math.max(current, left + root.getValue() + right));
        return current;
    }
}
