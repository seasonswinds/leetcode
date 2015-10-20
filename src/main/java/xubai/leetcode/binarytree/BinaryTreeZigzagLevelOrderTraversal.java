package xubai.leetcode.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import xubai.model.TreeNode;
import xubai.util.ArrayUtil;

/**
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left
 * to right, then right to left for the next level and alternate between).
 * 
 * For example: Given binary tree {3,9,20,#,#,15,7},
 *   3
 *  / \
 * 9 20
 *   / \
 *  15 7
 *
 * return its zigzag level order traversal as: [ [3], [20,9], [15,7] ]
 *
 * Created by xubai on 15/10/20.
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> binaryTreeZigzagLevelOrderTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return result;
        }
        boolean isReverse = false;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(null);
        List<Integer> list = new ArrayList<Integer>(1);
        while (!queue.isEmpty()) {
            TreeNode node = queue.pop();
            if (node != null) {
                list.add(node.getValue());
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            } else {
                if (isReverse) {
                    list = ArrayUtil.reverse(list);
                }
                result.add(list);
                if (queue.size() > 0) {
                    queue.add(null);
                    list = new ArrayList<Integer>(queue.size() - 1);
                    isReverse = !isReverse;
                }
            }
        }
        return result;
    }
}
