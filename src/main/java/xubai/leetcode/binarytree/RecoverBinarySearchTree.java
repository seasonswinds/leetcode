package xubai.leetcode.binarytree;

import xubai.model.TreeNode;

/**
 * Two elements of a binary search tree (BST) are swapped by mistake.
 * 
 * Recover the tree without changing its structure.
 * 
 * Note:
 * 
 * A solution using O(n) space is pretty straight forward.
 * 
 * Could you devise a constant space solution?
 * 
 * Created by xubai on 15/10/28.
 */
public class RecoverBinarySearchTree {
    private TreeNode pre = null;
    private TreeNode reverse1 = null;
    private TreeNode reverse2 = null;

    /**
     * 二叉搜索树的中序遍历序列是有序的。如果二叉搜索树的2个节点被交换，则会在中序遍历序列中产生逆序序列。
     * 中序遍历序列中相邻的2个节点交换会产生一个逆序；不相邻的结点交换会产生2个逆序。
     * 如果只有一个逆序，交换两个结点即可复原；
     * 如果有2个逆序，交换第一个逆序的第一个结点和第二个逆序的第二个结点，即可复原。
     *
     * @param root
     */
    public void recoverBinarySearchTree(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root);
        if (reverse1 != null) {
            int temp = reverse1.getValue();
            reverse1.setValue(reverse2.getValue());
            reverse2.setValue(temp);
        }
    }

    private void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.getLeft());
        if (pre != null && pre.getValue() > root.getValue()) {
            if (reverse1 == null) {
                reverse1 = pre;
                reverse2 = root;
            } else {
                reverse2 = root;
            }
        }
        pre = root;
        inorderTraversal(root.getRight());
    }
}
