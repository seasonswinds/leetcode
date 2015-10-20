package xubai.leetcode.binarytree;

import xubai.model.TreeNode;
import xubai.util.ArrayUtil;

/**
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * 
 * Created by xubai on 15/10/20.
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    /**
     * preorder: 1 {2 4 5} {3 7 6 8}
     * inorder:  {4 2 5} 1 {6 7 3 8}
     *
     * 前序序列中第一位一定是根，用这个元素将中序序列分为2部分，这两部分就是根的左右子树。
     * 再根据中序序列中子树的元素个数，找出两个子树的前序序列。
     * 递归这个过程即可构建整个树。
     *
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode constructBinaryTreeFromPreorderAndInorderTraversal(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int rootindex, int[] inorder, int instart, int inend) {
        if (rootindex < 0 || rootindex > preorder.length - 1) {
            return null;
        }
        int rootValue = preorder[rootindex];
        TreeNode root = new TreeNode(rootValue);
        int index = ArrayUtil.find(inorder, instart, inend, rootValue);
        if (index == -1) {
            return null;
        }
        if (index > instart) {
            TreeNode left = buildTree(preorder, rootindex + 1, inorder, instart, index - 1);
            root.setLeft(left);
        }
        if (index < inend) {
            TreeNode right = buildTree(preorder, rootindex + index - instart + 1, inorder, index + 1, inend);
            root.setRight(right);
        }
        return root;
    }
}
