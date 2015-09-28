package xubai.leetcode.list;

import xubai.model.ListNode;

/**
 * Reverse a singly linked list.
 * 
 * Created by xubai on 15/9/28.
 */
public class ReverseLinkedList {
    public ListNode reverseLinkedList(ListNode list) {
        if (list == null || list.getNext() == null) {
            return list;
        }
        ListNode p = list;
        ListNode q = list.getNext();
        list.setNext(null);
        while (q != null) {
            ListNode temp = q.getNext();
            q.setNext(p);
            p = q;
            q = temp;
        }
        return p;
    }
}
