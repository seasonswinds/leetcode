package xubai.leetcode.binarytree;

import java.util.Stack;

import xubai.model.TreeNode;

/**
 * Given a binary tree, flatten it to a linked list in-place.
 * 
 * For example, Given
 * 
 *      1
 *    /  \
 *   2   5
 *  / \   \
 * 3  4   6
 *
 * The flattened tree should look like:
 *
 * 1
 *  \
 *  2
 *   \
 *   3
 *    \
 *    4
 *     \
 *     5
 *      \
 *      6
 * 
 * Created by xubai on 15/10/21.
 */
public class FlattenBinaryTreeToLinkedList {
    /**
     * 用一个栈来保存结点的右子树，然后将左子树设置为右子树
     * 
     * @param root
     */
    public void flattenBinaryTreeToLinkedList(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        do {
            if (node.getRight() != null) {
                stack.push(node.getRight());
            }
            if (node.getLeft() != null) {
                node.setRight(node.getLeft());
                node.setLeft(null);
            } else {
                node.setRight(stack.pop());
            }
            node = node.getRight();
        } while (!stack.isEmpty());
    }
}
