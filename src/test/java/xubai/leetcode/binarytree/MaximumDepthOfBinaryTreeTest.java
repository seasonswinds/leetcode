package xubai.leetcode.binarytree;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xubai.model.TreeNode;

/**
 * 输入：1  ，预期输出3。
 *     / \
 *    2  3
 *      / \
 *     4  5
 *
 * Created by xubai on 15/10/21.
 */
public class MaximumDepthOfBinaryTreeTest {
    private MaximumDepthOfBinaryTree o = new MaximumDepthOfBinaryTree();
    private TreeNode root;

    @Before
    public void setUp() {
        int[] array = {1, 2, 3, -1, -1, 4, 5};
        root = TreeNode.createTree(array);
    }

    @Test
    public void test() {
        int result;
        result = o.maximumDepthOfBinaryTree(root);
        assertTrue(result == 3);
        result = o.maximumDepthOfBinaryTree1(root);
        assertTrue(result == 3);
    }
}
