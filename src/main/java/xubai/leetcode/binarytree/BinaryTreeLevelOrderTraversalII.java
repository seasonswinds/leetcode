package xubai.leetcode.binarytree;

import xubai.model.TreeNode;
import xubai.util.ArrayUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 * 
 * For example, given binary tree {3, 9, 20, #, #, 15, 7},
 * 
 *   3
 *  / \
 * 9  20
 *   / \
 *  15 7
 * 
 * return its level order traversal as [[15, 7], [9, 20], [3]]
 * 
 * Created by xubai on 15/10/16.
 */
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> binaryTreeLevelOrderTraversalII(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if (root == null) {
            return lists;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(null);
        List<Integer> list = new ArrayList<Integer>(1);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node == null) {
                lists.add(list);
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
        return ArrayUtil.reverse(lists);

    }
}
