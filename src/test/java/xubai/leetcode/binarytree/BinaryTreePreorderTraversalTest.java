package xubai.leetcode.binarytree;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import xubai.model.TreeNode;
import xubai.util.CommonUtil;

/**
 * 输入： 1  ，预期输出为{1, 2, 4, 5, 3}
 *     /  \
 *    2   3
 *   / \
 *  4  5
 *
 * Created by xubai on 15/10/20.
 */
public class BinaryTreePreorderTraversalTest {
    private BinaryTreePreorderTraversal o = new BinaryTreePreorderTraversal();
    private TreeNode root;

    @Before
    public void setUp() {
        int[] array = {1, 2, 3, 4, 5};
        root = TreeNode.createTree(array);
    }

    @Test
    public void test() {
        List<Integer> result = o.binaryTreePreorderTraversal(root);
        assertTrue("1, 2, 4, 5, 3".equals(CommonUtil.listToString(result)));
        result = o.binaryTreePreorderTraversal1(root);
        assertTrue("1, 2, 4, 5, 3".equals(CommonUtil.listToString(result)));
    }
}
