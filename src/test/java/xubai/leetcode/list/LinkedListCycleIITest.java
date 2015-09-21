package xubai.leetcode.list;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xubai.model.ListNode;

/**
 * 构建有环链表1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 4 ...，查询环起始点，预期返回4；
 *
 * Created by xubai on 15/9/21.
 */
public class LinkedListCycleIITest {
    LinkedListCycleII o = new LinkedListCycleII();
    private ListNode head;

    @Before
    public void setUp() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        head = ListNode.createLinkedList(array);
        ListNode.addCycle(head, 3);
    }

    @Test
    public void test() {
        assertTrue(o.linkedListCycleII(head).getValue() == 4);
    }
}
