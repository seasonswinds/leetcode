package xubai.leetcode.binarytree;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import xubai.model.TreeNode;
import xubai.util.CommonUtil;

/**
 * 输入中序序列：{4, 2, 5, 1, 6, 7, 3, 8}以及后序序列{4, 5, 2, 6, 7, 8, 3, 1}
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
public class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {
    private ConstructBinaryTreeFromInorderAndPostorderTraversal o = new ConstructBinaryTreeFromInorderAndPostorderTraversal();
    private BinaryTreeInorderTraversal out = new BinaryTreeInorderTraversal();
    private int[] inorder = {4, 2, 5, 1, 6, 7, 3, 8};
    private int[] postorder = {4, 5, 2, 6, 7, 8, 3, 1};

    @Test
    public void test() {
        TreeNode root = o.constructBinaryTreeFromInorderAndPostorderTraversal(inorder, postorder);
        assertTrue("4, 2, 5, 1, 6, 7, 3, 8".equals(TreeNode.inorderToString(root)));
    }
}
