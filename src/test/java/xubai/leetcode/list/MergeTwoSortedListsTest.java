package xubai.leetcode.list;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xubai.model.ListNode;

/**
 * 输入链表A：1 -> 3 -> 7，链表B：2 -> 4 -> 6 -> 8 -> 10。
 * 合并后，预期输出为1 -> 2 -> 3 -> 4 -> 6 -> 7 -> 8 -> 10。
 *
 * Created by xubai on 15/9/22.
 */
public class MergeTwoSortedListsTest {
    private MergeTwoSortedLists o = new MergeTwoSortedLists();
    private ListNode listA;
    private ListNode listB;

    @Before
    public void setUp() {
        int[] arrayA = {1, 3, 7};
        listA = ListNode.createLinkedList(arrayA);
        int[] arrayB = {2, 4, 6, 8, 10};
        listB = ListNode.createLinkedList(arrayB);
    }

    @Test
    public void test() {
        ListNode newList = o.mergeTwoSortedLists(listA, listB);
        assertTrue("1, 2, 3, 4, 6, 7, 8, 10".equals(ListNode.output(newList)));
    }
}
