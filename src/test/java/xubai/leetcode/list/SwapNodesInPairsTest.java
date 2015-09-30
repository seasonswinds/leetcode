package xubai.leetcode.list;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xubai.model.ListNode;

/**
 * 输入链表：1 -> 2 -> 3 -> 4，预计输出为：2 -> 1 -> 4 -> 3
 * 
 * Created by xubai on 15/9/30.
 */
public class SwapNodesInPairsTest {
    private SwapNodesInPairs o = new SwapNodesInPairs();
    private ListNode list;

    @Before
    public void setUp() {
        int[] array = {1, 2, 3, 4};
        list = ListNode.createLinkedList(array);
    }

    @Test
    public void test() {
        list = o.swapNodesInPairs(list);
        assertTrue("2, 1, 4, 3".equals(ListNode.output(list)));
    }
}
