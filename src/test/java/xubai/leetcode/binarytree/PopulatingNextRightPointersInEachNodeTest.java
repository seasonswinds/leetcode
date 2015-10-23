package xubai.leetcode.binarytree;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xubai.model.TreeLinkNode;

/**
 * 输入：1   ，预期输出为{{1}, {2, 3}, {4, 5, 6, 7}}。
 *    /   \
 *   2    3
 *  / \  / \
 * 4  5 6  7
 *
 * Created by xubai on 15/10/23.
 */
public class PopulatingNextRightPointersInEachNodeTest {
    private PopulatingNextRightPointersInEachNode o = new PopulatingNextRightPointersInEachNode();
    private TreeLinkNode root;
    private TreeLinkNode root1;

    @Before
    public void setUp() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        root = TreeLinkNode.createTree(array);
        root1 = TreeLinkNode.createTree(array);
    }

    @Test
    public void test() {
        o.populatingNextRightPointersInEachNode(root);
        assertTrue("{1}, {2, 3}, {4, 5, 6, 7}".equals(TreeLinkNode.levelOrderToString(root)));
        o.populatingNextRightPointersInEachNode1(root1);
        assertTrue("{1}, {2, 3}, {4, 5, 6, 7}".equals(TreeLinkNode.levelOrderToString(root1)));
    }
}
