package xubai.leetcode.binarytree;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import xubai.model.TreeNode;
import xubai.util.CommonUtil;

/**
 * 输入： 1  ，预期输出为{4, 5, 2, 3, 1}
 *     /  \
 *    2   3
 *   / \
 *  4  5
 *
 * Created by xubai on 15/10/20.
 */
public class BinaryTreePostorderTraversalTest {
    private BinaryTreePostorderTraversal o = new BinaryTreePostorderTraversal();
    private TreeNode root;

    @Before
    public void setUp() {
        int[] array = {1, 2, 3, 4, 5};
        root = TreeNode.createTree(array);
    }

    @Test
    public void test() {
        List<Integer> result = o.binaryTreePostorderTraversal(root);
        assertTrue("4, 5, 2, 3, 1".equals(CommonUtil.listToString(result)));
        result = o.binaryTreePostorderTraversal1(root);
        assertTrue("4, 5, 2, 3, 1".equals(CommonUtil.listToString(result)));
    }
}
