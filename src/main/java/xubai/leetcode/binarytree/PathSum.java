package xubai.leetcode.binarytree;

import java.util.LinkedList;
import java.util.Stack;

import xubai.model.TreeNode;

/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up
 * all the values along the path equals the given sum.
 * 
 * For example: Given the below binary tree and sum = 22,
 * 
 *        5
 *      /  \
 *     4   8
 *    /   / \
 *   11  13 4
 *  / \      \
 * 7  2      1
 * 
 * return true, as there exist a root-to-leaf path 5 -> 4 -> 11 -> 2 which sum is 22.
 * 
 * Created by xubai on 15/10/22.
 */
public class PathSum {
    /**
     * 递归
     *
     * @param root
     * @param sum
     * @return
     */
    public boolean pathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.getValue() == sum && root.getLeft() == null && root.getRight() == null) {
            return true;
        }
        return pathSum(root.getLeft(), sum - root.getValue()) || pathSum(root.getRight(), sum - root.getValue());
    }

    /**
     * 非递归
     * 
     * 采用前序遍历的方式，用栈来存储路径上的元素，路径和即为栈中元素的和。
     * 
     * @param root
     * @param sum
     * @return
     */
    public boolean pathSum1(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        int valueSum = root.getValue();
        TreeNode pre = null;
        while (!stack.isEmpty()) {
            TreeNode curr = stack.peek();
            if (pre == null || pre.getLeft() == curr || pre.getRight() == curr) {
                if (curr.getLeft() != null) {
                    stack.push(curr.getLeft());
                    valueSum += curr.getLeft().getValue();
                } else if (curr.getRight() != null) {
                    stack.push(curr.getRight());
                    valueSum += curr.getRight().getValue();
                } else {
                    if (valueSum == sum) {
                        return true;
                    }
                    valueSum -= curr.getValue();
                    stack.pop();
                }
            } else if (pre == curr.getLeft()) {
                if (curr.getRight() != null) {
                    stack.push(curr.getRight());
                    valueSum += curr.getRight().getValue();
                } else {
                    valueSum -= curr.getValue();
                    stack.pop();
                }
            } else if (pre == curr.getRight()) {
                valueSum -= curr.getValue();
                stack.pop();
            }
            pre = curr;
        }
        return false;
    }

    /**
     * 非递归
     *
     * 采用层次遍历的方式，用一个路径和队列记录每个结点的路径和，遇到叶子结点与sum比较。
     * 
     * @param root
     * @param sum
     * @return
     */
    public boolean pathSum2(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        LinkedList<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        LinkedList<Integer> valueSumQueue = new LinkedList<Integer>();
        nodeQueue.add(root);
        valueSumQueue.add(root.getValue());
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.pop();
            int valueSum = valueSumQueue.pop();
            if (valueSum == sum && node.getLeft() == null && node.getRight() == null) {
                return true;
            }
            if (node.getLeft() != null) {
                nodeQueue.add(node.getLeft());
                valueSumQueue.add(valueSum + node.getLeft().getValue());
            }
            if (node.getRight() != null) {
                nodeQueue.add(node.getRight());
                valueSumQueue.add(valueSum + node.getRight().getValue());
            }
        }
        return false;
    }
}
