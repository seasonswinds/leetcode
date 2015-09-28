package xubai.leetcode.list;

import org.junit.Before;
import org.junit.Test;
import xubai.model.ListNode;

import static org.junit.Assert.assertTrue;

/**
 * 输入链表：1 -> 2 -> 3 -> 4，预期输出：4 -> 3 -> 2 -> 1
 * 
 * Created by xubai on 15/9/28.
 */
public class ReverseLinkedListTest {
    private ReverseLinkedList o = new ReverseLinkedList();
    private ListNode list;

    @Before
    public void setUp() {
        int[] array = {1, 2, 3, 4};
        list = ListNode.createLinkedList(array);
    }

    @Test
    public void test() {
        ListNode result = o.reverseLinkedList(list);
        assertTrue("4, 3, 2, 1".equals(ListNode.output(result)));
    }
}
