package xubai.leetcode.binarytree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xubai.model.TreeNode;

/**
 * 输入：2 ，预期输出为true；
 *     / \
 *    1  3
 * 
 * 输入：1 ，预期输出为false。
 *     / \
 *    2  3
 * 
 * Created by xubai on 15/10/26.
 */
public class ValidateBinarySearchTreeTest {
    private ValidateBinarySearchTree o = new ValidateBinarySearchTree();
    private TreeNode root1;
    private TreeNode root2;

    @Before
    public void setUp() {
        int[] array1 = {2, 1, 3};
        root1 = TreeNode.createTree(array1);
        int[] array2 = {1, 2, 3};
        root2 = TreeNode.createTree(array2);
    }

    @Test
    public void test() {
        boolean result;
        result = o.validateBinarySearchTree(root1);
        assertTrue(result);
        result = o.validateBinarySearchTree(root2);
        assertFalse(result);
        result = o.validateBinarySearchTree1(root1);
        assertTrue(result);
        result = o.validateBinarySearchTree1(root2);
        assertFalse(result);
    }
}
