package xubai.leetcode.list;

import xubai.model.ListNode;

/**
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 * 
 * For example: Given 1 -> 2 -> 3 -> 4 -> 5 -> NULL and k = 2, return 4 -> 5 -> 1 -> 2 -> 3 -> NULL.
 * 
 * Created by xubai on 15/9/29.
 */
public class RotateList {
    public ListNode rotateList(ListNode list, int k) {
        if (list == null || list.getNext() == null) {
            return list;
        }
        ListNode fakeHead = new ListNode(0);
        fakeHead.setNext(list);
        ListNode fast = fakeHead;
        ListNode slow = fakeHead;
        for (int i = 0 ; i < k ; i++) {
            fast = fast.getNext();
            if (fast.getNext() == null) {
                return fakeHead.getNext();
            }
        }
        while (fast.getNext() != null) {
            fast = fast.getNext();
            slow = slow.getNext();
        }
        fast.setNext(fakeHead.getNext());
        fakeHead.setNext(slow.getNext());
        slow.setNext(null);
        return fakeHead.getNext();
    }
}
