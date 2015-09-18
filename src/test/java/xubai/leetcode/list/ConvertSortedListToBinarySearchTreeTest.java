package xubai.leetcode.list;

import org.junit.Before;
import org.junit.Test;

import xubai.model.ListNode;
import xubai.util.CommonUtil;

import static org.junit.Assert.assertTrue;

/**
 * 输入链表为(1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7)，预期输出为[4, 2, 6, 1, 3, 5, 7]
 *
 * Created by xubai on 15/9/18.
 */
public class ConvertSortedListToBinarySearchTreeTest {
    private ConvertSortedListToBinarySearchTree o;
    private ListNode list = null;

    @Before
    public void setUp() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        list = ListNode.createLinkedList(array);
        o = new ConvertSortedListToBinarySearchTree(list);
    }

    @Test
    public void test() {
        int[] result = o.convertSortedListToBinarySearchTree();
        assertTrue("4, 2, 6, 1, 3, 5, 7".equals(CommonUtil.arrayToString(result)));
    }
}
