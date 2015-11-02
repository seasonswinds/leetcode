package xubai.leetcode.binarytree;

import org.junit.Before;
import org.junit.Test;
import xubai.model.TreeNode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * 输入rootA：1 ，rootB：1 ，预期输出为true。
 *          / \       / \
 *         2  3      2  3
 *
 * 输入rootC：1 ，rootD：1 ，预期输出为false。
 *          / \         \
 *         2  3         3
 *
 * Created by xubai on 15/11/2.
 */
public class SameTreeTest {
    private SameTree o = new SameTree();
    private TreeNode rootA;
    private TreeNode rootB;
    private TreeNode rootC;
    private TreeNode rootD;

    @Before
    public void setUp() {
        int[] arrayA = {1, 2, 3};
        rootA = TreeNode.createTree(arrayA);
        int[] arrayB = {1, 2, 3};
        rootB = TreeNode.createTree(arrayB);
        int[] arrayC = {1, 2, 3};
        rootC = TreeNode.createTree(arrayC);
        int[] arrayD = {1, -1, 3};
        rootD = TreeNode.createTree(arrayD);
    }

    @Test
    public void test() {
        boolean result;
        result = o.sameTree(rootA, rootB);
        assertTrue(result);
        result = o.sameTree(rootC, rootD);
        assertFalse(result);
    }
}
