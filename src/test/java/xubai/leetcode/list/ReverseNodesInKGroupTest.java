package xubai.leetcode.list;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import xubai.model.ListNode;

/**
 * 输入链表：1 -> 2 -> 3 -> 4 -> 5
 * 
 * 输入k = 2，预期输出为：2 -> 1 -> 4 -> 3 -> 5
 * 
 * 输入k = 3，预期输出为：3 -> 2 -> 1 -> 4 -> 5
 * 
 * Created by xubai on 15/9/29.
 */
public class ReverseNodesInKGroupTest {
    private ReverseNodesInKGroup o = new ReverseNodesInKGroup();
    private ListNode list;
    private int k;

    @Test
    public void test() {
        int[] array = {1, 2, 3, 4, 5};
        list = ListNode.createLinkedList(array);
        k = 2;
        list = o.reverseNodesInKGroup(list, k);
        assertTrue("2, 1, 4, 3, 5".equals(ListNode.output(list)));
        list = ListNode.createLinkedList(array);
        k = 3;
        list = o.reverseNodesInKGroup(list, k);
        System.out.println(ListNode.output(list));
        assertTrue("3, 2, 1, 4, 5".equals(ListNode.output(list)));
    }
}
