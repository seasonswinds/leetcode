package xubai.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import xubai.model.TreeNode;

/**
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given
 * sum.
 * 
 * For example: Given the below binary tree and sum = 22,
 *
 *        5
 *      /   \
 *     4    8
 *    /   /  \
 *   11  13  4
 *  / \     / \
 * 7  2    5  1
 * 
 * return [[5, 4, 11, 2], [5, 8, 4, 5]]
 * 
 * Created by xubai on 15/10/22.
 */
public class PathSumII {
    /**
     * 递归
     *
     * @param root
     * @param sum
     * @return
     */
    public List<List<Integer>> pathSumII(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return result;
        }
        List<Integer> list = new ArrayList<Integer>();
        pathSumII(root, sum, result, list);
        return result;
    }

    private void pathSumII(TreeNode root, int sum, List<List<Integer>> result, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.getValue());
        if (sum == root.getValue() && root.getLeft() == null && root.getRight() == null) {
            List<Integer> temp = new ArrayList<Integer>(list.size());
            temp.addAll(list);
            result.add(temp);
        }
        if (root.getLeft() != null) {
            pathSumII(root.getLeft(), sum - root.getValue(), result, list);
            list.remove(list.size() - 1);
        }
        if (root.getRight() != null) {
            pathSumII(root.getRight(), sum - root.getValue(), result, list);
            list.remove(list.size() - 1);
        }
    }

    /**
     * 非递归，前序遍历
     *
     * @param root
     * @param sum
     * @return
     */
    public List<List<Integer>> pathSumII1(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return result;
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
                        List<Integer> temp = new ArrayList<Integer>();
                        for (int i = 0; i < stack.size(); i++) {
                            temp.add(stack.get(i).getValue());
                        }
                        result.add(temp);
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
        return result;
    }
}
