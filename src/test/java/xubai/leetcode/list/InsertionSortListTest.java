package xubai.leetcode.list;

import org.junit.Before;
import org.junit.Test;

import xubai.model.ListNode;

/**
 * 输入链表为3 -> 7 -> 4 -> 9 -> 5 -> 2 -> 6 -> 1，预期输出为1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 9
 * 
 * Created by xubai on 15/9/18.
 */
public class InsertionSortListTest {
    private InsertionSortList o = new InsertionSortList();
    private ListNode head;

    @Before
    public void setUp() {
        int[] array = {3, 7, 4, 9, 5, 2, 6, 1};
        head = ListNode.createLinkedList(array);
    }

    @Test
    public void test() {
        ListNode newHead = o.insertionSoutList(head);
        System.out.println(ListNode.output(newHead));
    }
}
