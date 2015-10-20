package xubai.leetcode.binarytree;

import xubai.model.TreeNode;

/**
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 *
 * Created by xubai on 15/10/20.
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    /**
     * inorder:   {4 2 5} 1 {6 7 3 8} 
     * postorder: {4 5 2} {6 7 8 3} 1
     * 后序序列中最后一位一定是根，用这个数将中序序列分为2部分，这两部分就是根的左右子树。
     * 再根据中序序列中子树的元素个数，找出两个子树的后序序列。
     * 递归这个过程即可构建整个树。
     * 
     * @param inorder
     * @param postorder
     * @return
     */
    public TreeNode constructBinaryTreeFromInorderAndPostorderTraversal(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int instart, int inend, int[] postorder, int poststart, int postend) {
        int rootValue = postorder[postend];
        TreeNode root = new TreeNode(rootValue);
        int index = find(inorder, instart, inend, rootValue);
        if (index > instart) {
            TreeNode left = buildTree(inorder, instart, index - 1, postorder, poststart, index - instart + poststart - 1);
            root.setLeft(left);
        }
        if (index < inend) {
            TreeNode right = buildTree(inorder, index + 1, inend, postorder, index - instart + poststart, postend - 1);
            root.setRight(right);
        }
        return root;
    }

    private int find(int[] array, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
