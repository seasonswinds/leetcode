package xubai.leetcode.list;

import xubai.model.ListNode;

/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * 
 * For example, given linked list 1->2->3->4->5 and n = 2, the result is 1->2->3->5.
 * 
 * Created by xubai on 15/9/25.
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthNodeFromEndOfList(ListNode list, int n) {
        if (list == null || n < 1) {
            return list;
        }
        ListNode fakeHead = new ListNode(0);
        fakeHead.setNext(list);
        ListNode fast = fakeHead;
        ListNode slow = fakeHead;
        for (int i = 0 ; i <= n ; i++) {
            if (fast == null) {
                return list;
            }
            fast = fast.getNext();
        }
        while (fast != null) {
            fast = fast.getNext();
            slow = slow.getNext();
        }
        slow.setNext(slow.getNext().getNext());
        return fakeHead.getNext();
    }
}
