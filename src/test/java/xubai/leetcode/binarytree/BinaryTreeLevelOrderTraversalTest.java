package xubai.leetcode.binarytree;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import xubai.model.TreeNode;
import xubai.util.CommonUtil;

/**
 * 输入：  3   ，预期输出为：{{3}, {9, 20}, {15, 7}}
 *      /   \
 *     9    20
 *         / \
 *        15 7
 *
 * Created by xubai on 15/10/16.
 */
public class BinaryTreeLevelOrderTraversalTest {
    private BinaryTreeLevelOrderTraversal o = new BinaryTreeLevelOrderTraversal();
    private TreeNode root;

    @Before
    public void setUp() {
        int[] array = {3, 9, 20, -1, -1, 15, 7};
        root = TreeNode.createTree(array);
    }

    @Test
    public void test() {
        List<List<Integer>> result = o.binaryTreeLevelOrderTraversal(root);
        assertTrue("{3}, {9, 20}, {15, 7}".equals(CommonUtil.listToString(result)));
    }
}
