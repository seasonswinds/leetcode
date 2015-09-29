package xubai.leetcode.list;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xubai.model.ListNode;

/**
 * 输入链表：1 -> 2 -> 3 -> 4 -> 5 -> NULL，以及m = 2， n = 4；预期输出为： 1 -> 4 -> 3 -> 2 -> 5 -> NULL.
 * 
 * Created by xubai on 15/9/28.
 */
public class ReverseLinkedListIITest {
    private ReverseLinkedListII o = new ReverseLinkedListII();
    private ListNode list;
    private int m;
    private int n;

    @Before
    public void setUp() {
        int[] array = {1, 2, 3, 4, 5};
        list = ListNode.createLinkedList(array);
        m = 2;
        n = 4;
    }

    @Test
    public void test() {
        list = o.reverseLinkedListII(list, m, n);
        assertTrue("1, 4, 3, 2, 5".equals(ListNode.output(list)));
    }
}
