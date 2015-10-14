package xubai.leetcode.binarytree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xubai.model.TreeNode;

/**
 * 输入：  1    ，预期输出false；输入：      1   预期输出true。
 *    2       3                      2       3
 *  4  5                           4   5  6
 * 6
 *
 * Created by xubai on 15/10/14.
 */
public class BalancedBinaryTreeTest {
    private BalancedBinaryTree o = new BalancedBinaryTree();
    private TreeNode root1;
    private TreeNode root2;

    @Before
    public void setUp() {
        int[] tree1 = {1, 2, 3, 4, 5, -1, -1, 6};
        root1 = TreeNode.createTree(tree1);
        int[] tree2 = {1, 2, 3, 4, 5, 6};
        root2 = TreeNode.createTree(tree2);
    }

    @Test
    public void test() {
        assertFalse(o.balancedBinaryTree(root1));
        assertTrue(o.balancedBinaryTree(root2));
    }
}
