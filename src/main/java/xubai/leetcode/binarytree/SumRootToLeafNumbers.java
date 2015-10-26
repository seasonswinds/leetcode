package xubai.leetcode.binarytree;

import xubai.model.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a
 * number.
 * 
 * An example is the root-to-leaf path 1 -> 2 -> 3 which represents the number 123.
 * 
 * Find the total sum of all root-to-leaf numbers.
 * 
 * For example,
 * 
 *   1
 *  / \
 * 2  3
 * 
 * The root-to-leaf path 1 -> 2 represents the number 12. The root-to-leaf path 1 -> 3 represents
 * the number 13.
 * 
 * Return the sum = 12 + 13 = 25.
 * 
 * Created by xubai on 15/10/26.
 */
public class SumRootToLeafNumbers {
    /**
     * 递归
     *
     * @param root
     * @return
     */
    public int sumRootToLeafNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] sum = {0};
        int[] value = {0};
        sumRootToLeafNumbers(root, sum, value);
        return sum[0];
    }

    private void sumRootToLeafNumbers(TreeNode root, int[] sum, int[] value) {
        if (root == null) {
            return;
        }
        value[0] = value[0] * 10 + root.getValue();
        if (root.getLeft() == null && root.getRight() == null) {
            sum[0] += value[0];
        }
        if (root.getLeft() != null) {
            sumRootToLeafNumbers(root.getLeft(), sum, value);
            value[0] = value[0] / 10;
        }
        if (root.getRight() != null) {
            sumRootToLeafNumbers(root.getRight(), sum, value);
            value[0] = value[0] / 10;
        }
    }

    /**
     * 非递归，前序遍历
     *
     * @param root
     * @return
     */
    public int sumRootToLeafNumbers1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
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
                    int temp = 0;
                    for (int i = 0; i < stack.size(); i++) {
                        temp = temp * 10 + stack.get(i).getValue();
                    }
                    sum += temp;
                    stack.pop();
                }
            } else if (pre == curr.getLeft()) {
                if (curr.getRight() != null) {
                    stack.push(curr.getRight());
                } else {
                    stack.pop();
                }
            } else if (pre == curr.getRight()) {
                stack.pop();
            }
            pre = curr;
        }
        return sum;
    }
}
