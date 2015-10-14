package xubai.leetcode.binarytree;

import org.junit.Before;
import org.junit.Test;
import xubai.model.TreeNode;
import xubai.util.CommonUtil;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * 输入：1  ，预期输出为{4, 2, 5, 1, 3}
 *    2   3
 *   4 5
 *
 * Created by xubai on 15/10/14.
 */
public class BinaryTreeInorderTraversalTest {
    private BinaryTreeInorderTraversal o = new BinaryTreeInorderTraversal();
    private TreeNode root;

    @Before
    public void setUp() {
        int[] array = {1, 2, 3, 4, 5};
        root = TreeNode.createTree(array);
    }

    @Test
    public void test() {
        List<Integer> result = o.binaryTreeInorderTraversal(root);
        assertTrue("4, 2, 5, 1, 3".equals(CommonUtil.listToString(result)));
        result = o.binaryTreeInorderTraversal1(root);
        assertTrue("4, 2, 5, 1, 3".equals(CommonUtil.listToString(result)));
    }
}
