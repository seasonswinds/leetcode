package xubai.leetcode.binarytree;

import xubai.model.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Binary Tree Postorder Traversal
 *
 * Created by xubai on 15/10/20.
 */
public class BinaryTreePostorderTraversal {
    /**
     * 递归
     *
     * @param root
     * @return
     */
    public List<Integer> binaryTreePostorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>(0);
        }
        List<Integer> list = new ArrayList<Integer>();
        binaryTreePostorderTraversal(root, list);
        return list;
    }

    private void binaryTreePostorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        binaryTreePostorderTraversal(node.getLeft(), list);
        binaryTreePostorderTraversal(node.getRight(), list);
        list.add(node.getValue());
    }

    /**
     * 非递归
     *
     * 使用一个指针，指向上次访问的结点。
     * 根据上次访问的结点(pre)与本次访问结点(curr)的关系判断应该做什么动作。
     * 如果pre == null，则curr为root结点。
     * 如果pre.left == curr或者pre.right == curr，即curr是pre的孩子结点，需优先遍历curr的左子树或右子树。
     * 如果pre == curr.left，则表明刚遍历完curr的左子树，需优先遍历curr的右子树。
     * 如果pre == curr.right，则表明已经遍历完curr的左右子树，应该遍历curr结点。
     *
     * @param root
     * @return
     */
    public List<Integer> binaryTreePostorderTraversal1(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>(0);
        }
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        TreeNode pre = null;
        while (!stack.isEmpty()) {
            TreeNode curr = stack.peek();
            if (pre == null || pre.getLeft() == curr || pre.getRight() == curr) {
                if (curr.getLeft() != null) {
                    stack.push(curr.getLeft());
                } else if (curr.getRight() != null) {
                    stack.push(curr.getRight());
                } else {
                    list.add(curr.getValue());
                    stack.pop();
                }
            } else if (pre == curr.getLeft()) {
                if (curr.getRight() != null) {
                    stack.push(curr.getRight());
                } else {
                    stack.pop();
                    list.add(curr.getValue());
                }
            } else if (pre == curr.getRight()) {
                stack.pop();
                list.add(curr.getValue());
            }
            pre = curr;
        }
        return list;
    }
}
