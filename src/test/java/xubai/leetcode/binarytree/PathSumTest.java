package xubai.leetcode.binarytree;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xubai.model.TreeNode;

/**
 * 输入：  5   ，以及sum = 22，预期输出：true
 *      /  \
 *     4   8
 *    /   / \
 *   11  13 4
 *  / \      \
 * 7  2      1
 *
 * Created by xubai on 15/10/22.
 */
public class PathSumTest {
    private PathSum o = new PathSum();
    private TreeNode root;
    private int sum = 22;

    @Before
    public void setUp() {
        int[] array = {5, 4, 8, 11, -1, 13, 4, 7, 2, -1, -1, -1, -1, -1, 1};
        root = TreeNode.createTree(array);
    }

    @Test
    public void test() {
        boolean result;
        result = o.pathSum(root, sum);
        assertTrue(result);
        result = o.pathSum1(root, sum);
        assertTrue(result);
        result = o.pathSum2(root, sum);
        assertTrue(result);
    }
}
