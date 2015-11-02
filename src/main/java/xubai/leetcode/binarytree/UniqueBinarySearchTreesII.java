package xubai.leetcode.binarytree;

import xubai.model.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Given n, generate all structurally unique BST's (binary search trees) that store values 1...n.
 * 
 * For example, Given n = 3, your program should return all 5 unique BST's shown below.
 *
 *  1      3   3   2   1
 *   \    /   /   / \   \
 *   3   2   1   1  3   2
 *  /   /     \          \
 * 2   1      2          3
 *
 * Created by xubai on 15/11/2.
 */
public class UniqueBinarySearchTreesII {
    public List<TreeNode> uniqueBinarySearchTreesII(int n) {
        return uniqueBinarySearchTreesII(1, n);
    }

    private List<TreeNode> uniqueBinarySearchTreesII(int start, int end) {
        List<TreeNode> list = new LinkedList<TreeNode>();
        if (start > end) {
            list.add(null);
            return list;
        }
        for (int i = start ; i <= end ; i++) {
            List<TreeNode> leftList = uniqueBinarySearchTreesII(start, i - 1);
            List<TreeNode> rightList = uniqueBinarySearchTreesII(i + 1, end);
            for (TreeNode left : leftList) {
                for (TreeNode right : rightList) {
                    TreeNode root = new TreeNode(i);
                    root.setLeft(left);
                    root.setRight(right);
                    list.add(root);
                }
            }
        }
        return list;
    }
}
