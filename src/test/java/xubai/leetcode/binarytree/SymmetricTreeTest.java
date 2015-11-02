package xubai.leetcode.binarytree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xubai.model.TreeNode;

/**
 * 输入：1   ，预期输出为：true。
 *    /   \
 *   2    2
 *  / \  / \
 * 3  4 4  3
 *
 * 输入：1 ，预期输出为false。
 *    /  \
 *   2   2
 *   \   \
 *   3   3
 *
 * Created by xubai on 15/11/2.
 */
public class SymmetricTreeTest {
    private SymmetricTree o = new SymmetricTree();
    private TreeNode rootA;
    private TreeNode rootB;

    @Before
    public void setUp() {
        int[] arrayA = {1, 2, 2, 3, 4, 4, 3};
        rootA = TreeNode.createTree(arrayA);
        int[] arrayB = {1, 2, 2, -1, 3, -1, 3};
        rootB = TreeNode.createTree(arrayB);
    }

    @Test
    public void test() {
        boolean result;
        result = o.symmetricTree(rootA);
        assertTrue(result);
        result = o.symmetricTree(rootB);
        assertFalse(result);
    }
}
