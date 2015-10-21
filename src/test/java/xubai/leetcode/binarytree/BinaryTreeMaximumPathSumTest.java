package xubai.leetcode.binarytree;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xubai.model.TreeNode;

/**
 * 输入：1 ，预期输出为6
 *     / \
 *    2  3
 * 
 * Created by xubai on 15/10/21.
 */
public class BinaryTreeMaximumPathSumTest {
    private BinaryTreeMaximumPathSum o = new BinaryTreeMaximumPathSum();
    private TreeNode root;

    @Before
    public void setUp() {
        int[] array = {1, 2, 3};
        root = TreeNode.createTree(array);
    }

    @Test
    public void test() {
        int result = o.binaryTreeMaximumPathSum(root);
        assertTrue(result == 6);
    }
}
