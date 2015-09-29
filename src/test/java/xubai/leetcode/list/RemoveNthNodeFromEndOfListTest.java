package xubai.leetcode.list;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xubai.model.ListNode;

/**
 * 预期输入链表：1 -> 2 -> 3 -> 4 -> 5，以及n = 2；预期输出为：1 -> 2 -> 3 -> 5
 *
 * Created by xubai on 15/9/25.
 */
public class RemoveNthNodeFromEndOfListTest {
    private RemoveNthNodeFromEndOfList o = new RemoveNthNodeFromEndOfList();
    private ListNode list;
    private int n;

    @Before
    public void setUp() {
        int[] array = {1, 2, 3, 4, 5};
        list = ListNode.createLinkedList(array);
        n = 2;
    }

    @Test
    public void test() {
        ListNode result = o.removeNthNodeFromEndOfList(list, n);
        assertTrue("1, 2, 3, 5".equals(ListNode.output(result)));
    }
}
