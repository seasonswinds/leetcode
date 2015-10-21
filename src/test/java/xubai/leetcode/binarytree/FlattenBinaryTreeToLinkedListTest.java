package xubai.leetcode.binarytree;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xubai.model.TreeNode;

/**
 * 输入： 1   ，预期输出为：1
 *     /   \              \
 *    2    5              2
 *   / \    \              \
 *  3  4    6              3
 *                          \
 *                          4
 *                           \
 *                           5
 *                            \
 *                            6
 *
 * Created by xubai on 15/10/21.
 */
public class FlattenBinaryTreeToLinkedListTest {
    private FlattenBinaryTreeToLinkedList o = new FlattenBinaryTreeToLinkedList();
    private TreeNode root;

    @Before
    public void setUp() {
        int[] array = {1, 2, 5, 3, 4, -1, 6};
        root = TreeNode.createTree(array);
    }

    @Test
    public void test() {
        o.flattenBinaryTreeToLinkedList(root);
        assertTrue("1, 2, 3, 4, 5, 6".equals(TreeNode.inorderToString(root)));
    }
}
