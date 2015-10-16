package xubai.leetcode.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import xubai.model.TreeNode;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to
 * right, level by level).
 * 
 * For example: Given binary tree {3,9,20,#,#,15,7},
 * 
 *    3
 *   / \
 *  9  20
 *    / \
 *   15 7
 *
 * return its level order traversal as [[3], [9,20], [15,7]]
 * 
 * Created by xubai on 15/10/16.
 */
public class BinaryTreeLevelOrderTraversal {
    /**
     * 按层次顺序遍历，也即是广度优先遍历，需要用到队列（这里使用LinkedList做Queue）
     * 上层最后一个结点的孩子结点就是本层的最后一个结点（没有孩子结点的，跳过）。
     * 因此可以在每层结束时，向队列中添加一个null结点，用以标识一层已经结束。
     * 
     * @param root
     * @return
     */
    public List<List<Integer>> binaryTreeLevelOrderTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return result;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(null);
        List<Integer> list = new ArrayList<Integer>(1);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node == null) {
                result.add(list);
                if (!queue.isEmpty()) {
                    list = new ArrayList<Integer>(queue.size() - 1);
                    queue.add(null);
                }
            } else {
                list.add(node.getValue());
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
