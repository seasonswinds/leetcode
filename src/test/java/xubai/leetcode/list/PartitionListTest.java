package xubai.leetcode.list;

import org.junit.Before;
import org.junit.Test;

import xubai.model.ListNode;

import static org.junit.Assert.assertTrue;

/**
 * 输入链表：1 -> 4 -> 3 -> 2 -> 5 -> 2，以及x = 3。预期输出为：1 -> 2 -> 2 -> 4 -> 3 -> 5
 * 
 * Created by xubai on 15/9/24.
 */
public class PartitionListTest {
    private PartitionList o = new PartitionList();
    private ListNode list;
    private int x;

    @Before
    public void setUp() {
        int[] array = {1, 4, 3, 2, 5, 2};
        list = ListNode.createLinkedList(array);
        x = 3;
    }

    @Test
    public void test() {
        ListNode result = o.partitionList(list, x);
        assertTrue("1, 2, 2, 4, 3, 5".equals(ListNode.output(result)));
    }
}
