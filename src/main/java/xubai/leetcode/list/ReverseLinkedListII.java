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
    public ListNode reverseLinkedListII(ListNode list, int m, int n) {
        if (list == null || list.getNext() == null || n - m < 1) {
            return list;
        }
        if (m < 1) {
            m = 1;
        }
        ListNode fakeHead = new ListNode(0);
        fakeHead.setNext(list);
        ListNode p = fakeHead;
        for (int i = 0; i < m - 1; i++) {
            p = p.getNext();
            if (p == null || p.getNext() == null) {
                return fakeHead.getNext();
            }
        }
        ListNode pre = p;
        p = p.getNext();
        ListNode node = p;
        ListNode q = p.getNext();
        for (int i = m; i < n && q != null; i++) {
            ListNode temp = q.getNext();
            q.setNext(p);
            p = q;
            q = temp;
        }
        pre.setNext(p);
        node.setNext(q);
        return fakeHead.getNext();
    }
}
