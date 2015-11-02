package xubai.leetcode.binarytree;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import xubai.model.TreeNode;
import xubai.util.CommonUtil;

/**
 * 输入3，预期输出为：
 *
 *  1      3   3   2   1
 *   \    /   /   / \   \
 *   3   2   1   1  3   2
 *  /   /     \          \
 * 2   1      2          3
 * 
 * Created by xubai on 15/11/2.
 */
public class UniqueBinarySearchTreesIITest {
    private UniqueBinarySearchTreesII o = new UniqueBinarySearchTreesII();
    private BinaryTreeInorderTraversal out = new BinaryTreeInorderTraversal();
    private int n = 3;

    @Test
    public void test() {
        List<TreeNode> result = o.uniqueBinarySearchTreesII(n);
        assertTrue(result.size() == 5);
        for (TreeNode root : result) {
            assertTrue("1, 2, 3".equals(CommonUtil.listToString(out.binaryTreeInorderTraversal1(root))));
        }
    }
}
