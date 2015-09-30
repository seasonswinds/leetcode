package xubai.leetcode.list;

import org.junit.Before;
import org.junit.Test;
import xubai.model.ListNode;

import static org.junit.Assert.assertTrue;

/**
 * 输入链表：5 -> 3 -> 1 -> 2 -> 4，排序后，预期输出为：1 -> 2 -> 3 -> 4 -> 5
 *
 * Created by xubai on 15/9/30.
 */
public class SortListTest {
    private SortList o = new SortList();
    private ListNode list;

    @Before
    public void setUp() {
        int[] array = {5, 3, 1, 2, 4};
        list = ListNode.createLinkedList(array);
    }

    @Test
    public void test() {
        list = o.sortList(list);
        System.out.println(ListNode.output(list));
        assertTrue("1, 2, 3, 4, 5".equals(ListNode.output(list)));
    }
}
