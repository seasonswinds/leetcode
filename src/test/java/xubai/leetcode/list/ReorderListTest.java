package xubai.leetcode.list;

import org.junit.Before;
import org.junit.Test;
import xubai.model.ListNode;

import static org.junit.Assert.assertTrue;

/**
 * 输入链表：1 -> 2 -> 3 -> 4，预期输出为1 -> 4 -> 2 -> 3
 *
 * Created by xubai on 15/9/28.
 */
public class ReorderListTest {
    private ReorderList o = new ReorderList();
    private ListNode list;

    @Before
    public void setUp() {
        int[] array = {1, 2, 3, 4};
        list = ListNode.createLinkedList(array);
    }

    @Test
    public void test() {
        o.reorderList(list);
        assertTrue("1, 4, 2, 3".equals(ListNode.output(list)));
    }
}
