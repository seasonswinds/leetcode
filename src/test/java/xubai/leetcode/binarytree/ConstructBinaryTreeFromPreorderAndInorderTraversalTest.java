package xubai.leetcode.binarytree;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import xubai.model.TreeNode;
import xubai.util.CommonUtil;

/**
 * 输入前序序列：{1, 2, 4, 5, 3, 7, 6, 8}，以及中序序列：{4, 2, 5, 1, 6, 7, 3, 8}
 * 预期输出为：  1
 *          /     \
 *         2      3
 *        / \    / \
 *       4  5   7  8
 *             /
 *            6
 *
 * Created by xubai on 15/10/20.
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {
    private ConstructBinaryTreeFromPreorderAndInorderTraversal o = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
    private BinaryTreeInorderTraversal out = new BinaryTreeInorderTraversal();
    private int[] preorder = {1, 2, 4, 5, 3, 7, 6, 8};
    private int[] inorder = {4, 2, 5, 1, 6, 7, 3, 8};

    @Test
    public void test() {
        TreeNode root = o.constructBinaryTreeFromPreorderAndInorderTraversal(preorder, inorder);
        assertTrue("4, 2, 5, 1, 6, 7, 3, 8".equals(CommonUtil.listToString(out.binaryTreeInorderTraversal1(root))));
    }
}
