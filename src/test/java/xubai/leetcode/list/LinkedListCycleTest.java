package xubai.leetcode.list;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xubai.model.ListNode;

/**
 * 构建无环链表1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7，进行检测，预期返回false；
 * 为链表添加环1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 4 ...，再次进行检测，预期返回true；
 * 
 * Created by xubai on 15/9/21.
 */
public class LinkedListCycleTest {
    private LinkedListCycle o = new LinkedListCycle();
    private ListNode head;

    @Before
    public void setUp() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        head = ListNode.createLinkedList(array);
    }

    @Test
    public void test() {
        assertFalse(o.linkedListCycle(head));
        addCycle(head, 3);
        assertTrue(o.linkedListCycle(head));
    }

    private void addCycle(ListNode head, int index) {
        ListNode node = head;
        ListNode cycleHead = null;
        ListNode cycleTail = null;
        for (int i = 0; node != null; i++, node = node.getNext()) {
            if (i == index) {
                cycleTail = node;
            }
            if (node.getNext() == null) {
                cycleHead = node;
            }
        }
        if (cycleHead != null) {
            cycleHead.setNext(cycleTail);
        }
    }
}
