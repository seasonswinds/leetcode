package xubai.leetcode.binarytree;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import xubai.model.TreeLinkNode;
import xubai.util.CommonUtil;

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
        assertTrue("{1}, {2, 3}, {4, 5, 6, 7}".equals(levelOrderToString(root)));
        o.populatingNextRightPointersInEachNode1(root1);
        assertTrue("{1}, {2, 3}, {4, 5, 6, 7}".equals(levelOrderToString(root1)));
    }

    private String levelOrderToString(TreeLinkNode root) {
        if (root == null) {
            return "";
        }
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        LinkedList<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.add(root);
        queue.add(null);
        boolean isFirstNodeOfLevel = true;
        while (!queue.isEmpty()) {
            TreeLinkNode node = queue.pop();
            if (node == null) {
                if (!queue.isEmpty()) {
                    queue.add(null);
                    isFirstNodeOfLevel = true;
                }
            } else {
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
                if (isFirstNodeOfLevel) {
                    TreeLinkNode p = node;
                    List<Integer> list = new ArrayList<Integer>();
                    while (p != null) {
                        list.add(p.getValue());
                        p = p.getNext();
                    }
                    lists.add(list);
                    isFirstNodeOfLevel = false;
                }
            }
        }
        return CommonUtil.listToString(lists);
    }
}
