package xubai.leetcode.list;

import xubai.model.ListNode;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * 
 * For example, given 1 -> 2 -> 3 -> 4, you should return the list as 2 -> 1 -> 4 -> 3.
 * 
 * Your algorithm should use only constant space. You may not modify the values in the list, only
 * nodes itself can be changed.
 * 
 * Created by xubai on 15/9/30.
 */
public class SwapNodesInPairs {
    public ListNode swapNodesInPairs(ListNode list) {
        if (list == null || list.getNext() == null) {
            return list;
        }
        ListNode fakeHead = new ListNode(0);
        fakeHead.setNext(list);
        ListNode head = fakeHead;
        ListNode p = list;
        while (p != null && p.getNext() != null) {
            ListNode q = p.getNext();
            ListNode temp = q.getNext();
            q.setNext(p);
            p.setNext(temp);
            head.setNext(q);
            head = p;
            p = temp;
        }
        return fakeHead.getNext();
    }
}
