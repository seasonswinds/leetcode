package xubai.leetcode.binarytree;

import org.junit.Before;
import org.junit.Test;
import xubai.model.TreeNode;
import xubai.util.CommonUtil;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * 输入： 2  ，预期输出：2
 *     /  \          /  \
 *    5   4         1   4
 *       / \           / \
 *      3  1          3  5
 *
 * Created by xubai on 15/10/28.
 */
public class RecoverBinarySearchTreeTest {
    private RecoverBinarySearchTree o = new RecoverBinarySearchTree();
    private BinaryTreeInorderTraversal out = new BinaryTreeInorderTraversal();
    private TreeNode root;

    @Before
    public void setUp() {
        int[] array = {2, 5, 4, -1, -1, 3, 1};
        root = TreeNode.createTree(array);
    }

    @Test
    public void test() {
        o.recoverBinarySearchTree(root);
        List<Integer> result = out.binaryTreeInorderTraversal1(root);
        assertTrue("1, 2, 3, 4, 5".equals(CommonUtil.listToString(result)));
    }
}
