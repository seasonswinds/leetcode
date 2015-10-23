package xubai.leetcode.binarytree;

import org.junit.Before;
import org.junit.Test;
import xubai.model.TreeLinkNode;

import static org.junit.Assert.assertTrue;

/**
 * 输入：1   ，预期输出为{{1}, {2, 3}, {4, 5, 7}}
 *    /   \
 *   2    3
 *  / \    \
 * 4  5    7
 *
 * Created by xubai on 15/10/23.
 */
public class PopulatingNextRightPointersInEachNodeIITest {
    private PopulatingNextRightPointersInEachNodeII o = new PopulatingNextRightPointersInEachNodeII();
    private TreeLinkNode root;

    @Before
    public void setUp() {
        int[] array = {1, 2, 3, 4, 5, -1, 7};
        root = TreeLinkNode.createTree(array);
    }

    @Test
    public void test() {
        o.populatingNextRightPointersInEachNodeII(root);
        assertTrue("{1}, {2, 3}, {4, 5, 7}".equals(TreeLinkNode.levelOrderToString(root)));
    }

}
