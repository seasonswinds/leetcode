package xubai.leetcode.binarytree;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import xubai.model.TreeNode;
import xubai.util.CommonUtil;

/**
 * 输入：  5    ，以及sum = 22，预期输出{{5, 4, 11, 2}, {5, 8, 4, 5}}
 *      /   \
 *     4    8
 *    /   /  \
 *   11  13  4
 *  / \     / \
 * 7  2    5  1
 * 
 * Created by xubai on 15/10/22.
 */
public class PathSumIITest {
    private PathSumII o = new PathSumII();
    private TreeNode root;
    private int sum = 22;

    @Before
    public void setUp() {
        int[] array = {5, 4, 8, 11, -1, 13, 4, 7, 2, -1, -1, -1, -1, 5, 1};
        root = TreeNode.createTree(array);
    }

    @Test
    public void test() {
        List<List<Integer>> result;
        result = o.pathSumII(root, sum);
        assertTrue("{5, 4, 11, 2}, {5, 8, 4, 5}".equals(CommonUtil.listToString(result)));
        result = o.pathSumII1(root, sum);
        assertTrue("{5, 4, 11, 2}, {5, 8, 4, 5}".equals(CommonUtil.listToString(result)));
    }
}
