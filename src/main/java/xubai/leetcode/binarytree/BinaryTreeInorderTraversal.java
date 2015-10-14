package xubai.leetcode.binarytree;

import xubai.model.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Binary Tree Inorder Traversal
 *
 * Created by xubai on 15/10/14.
 */
public class BinaryTreeInorderTraversal {
    /**
     * 递归
     *
     * @param root
     * @return
     */
    public List<Integer> binaryTreeInorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>(0);
        }
        List<Integer> list = new ArrayList<Integer>();
        binaryTreeInorderTraversal(root, list);
        return list;
    }

    private void binaryTreeInorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        binaryTreeInorderTraversal(root.getLeft(), list);
        list.add(root.getValue());
        binaryTreeInorderTraversal(root.getRight(), list);
    }

    /**
     * 非递归
     *
     * @param root
     * @return
     */
    public List<Integer> binaryTreeInorderTraversal1(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>(0);
        }
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.getLeft();
            } else {
                node = stack.pop();
                list.add(node.getValue());
                node = node.getRight();
            }
        }
        return list;
    }
}
