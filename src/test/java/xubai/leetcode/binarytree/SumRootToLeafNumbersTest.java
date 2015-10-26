package xubai.leetcode.binarytree;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xubai.model.TreeNode;

/**
 * 输入：1 ，预期输出为25
 *     / \
 *    2  3
 *
 * Created by xubai on 15/10/26.
 */
public class SumRootToLeafNumbersTest {
    private SumRootToLeafNumbers o = new SumRootToLeafNumbers();
    private TreeNode root;

    @Before
    public void setUp() {
        int[] array = {1, 2, 3};
        root = TreeNode.createTree(array);
    }

    @Test
    public void test() {
        int result;
        result = o.sumRootToLeafNumbers(root);
        assertTrue(result == 25);
        result = o.sumRootToLeafNumbers1(root);
        assertTrue(result == 25);
    }
}
