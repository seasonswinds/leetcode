package xubai.leetcode.list;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xubai.model.ListNode;

/**
 * 输入链表：1 -> 2 -> 3 -> 4 -> 5 -> NULL以及k = 2；预期输出为：4 -> 5 -> 1 -> 2 -> 3 -> NULL
 * 
 * Created by xubai on 15/9/29.
 */
public class RotateListTest {
    private RotateList o = new RotateList();
    private ListNode list;
    private int k;

    @Before
    public void setUp() {
        int[] array = {1, 2, 3, 4, 5};
        list = ListNode.createLinkedList(array);
        k = 2;
    }

    @Test
    public void test() {
        list = o.rotateList(list, k);
        assertTrue("4, 5, 1, 2, 3".equals(ListNode.output(list)));
    }
}
