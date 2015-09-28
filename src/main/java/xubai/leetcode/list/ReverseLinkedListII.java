package xubai.leetcode.list;

import xubai.model.ListNode;

/**
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 * 
 * For example: given 1 -> 2 -> 3 -> 4 -> 5 -> NULL, m = 2 and n = 4, return 1 -> 4 -> 3 -> 2 -> 5
 * -> NULL.
 *
 * Created by xubai on 15/9/28.
 */
public class ReverseLinkedListII {
    public void reverseLinkedListII(ListNode list, int m, int n) {
        if (list == null || list.getNext() == null) {
            return;
        }
        ListNode p = list;
        int i = 2;
        for (; i < m ; i++) {
            p = p.getNext();
            if (p == null || p.getNext() == null) {
                return;
            }
        }
        ListNode pre = p;
        p = p.getNext();
        ListNode node = p;
        ListNode q = p.getNext();
        for (; i < n && q != null; i++) {
            ListNode temp = q.getNext();
            q.setNext(p);
            p = q;
            q = temp;
        }
        pre.setNext(p);
        node.setNext(q);
    }
}
