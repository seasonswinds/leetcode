package xubai.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import xubai.model.TreeNode;

/**
 * Binary Tree Preorder Traversal
 *
 * Created by xubai on 15/10/20.
 */
public class BinaryTreePreorderTraversal {
    /**
     * 递归
     *
     * @param root
     * @return
     */
    public List<Integer> binaryTreePreorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>(0);
        }
        List<Integer> list = new ArrayList<Integer>();
        binaryTreePreorderTraversal(root, list);
        return list;
    }

    private void binaryTreePreorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.getValue());
        binaryTreePreorderTraversal(node.getLeft(), list);
        binaryTreePreorderTraversal(node.getRight(), list);
    }

    /**
     * 非递归
     *
     * @param root
     * @return
     */
    public List<Integer> binaryTreePreorderTraversal1(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>(0);
        }
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.getValue());
            if (node.getRight() != null) {
                stack.push(node.getRight());
            }
            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }
        return list;
    }
}
