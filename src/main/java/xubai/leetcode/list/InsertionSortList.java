package xubai.leetcode.list;

import xubai.model.ListNode;

/**
 * Sort a linked list using insertion sort.
 * 
 * Created by xubai on 15/9/18.
 */
public class InsertionSortList {
    public ListNode insertionSoutList(ListNode head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        ListNode newHead = head;
        ListNode pre = head;
        ListNode node = head.getNext();
        while (node != null) {
            ListNode p = null;
            ListNode q = newHead;
            while (q != node) {
                if (node.getValue() < q.getValue()) {
                    pre.setNext(node.getNext());
                    node.setNext(q);
                    if (p == null) {
                        newHead = node;
                    } else {
                        p.setNext(node);
                    }
                    break;
                } else {
                    p = q;
                    q = q.getNext();
                }
            }
            if (node == pre.getNext()) {
                pre = pre.getNext();
            }
            node = pre.getNext();
        }
        return newHead;
    }
}
