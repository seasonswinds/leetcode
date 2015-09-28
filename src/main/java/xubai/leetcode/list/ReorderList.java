package xubai.leetcode.list;

import xubai.model.ListNode;

/**
 * Given a singly linked list L: L0 -> L1 -> ... -> Ln-1 -> Ln, reorder it to: L0 -> Ln -> L1 ->
 * Ln-1 -> L2 -> Ln-2 -> ...
 * 
 * For example, given {1, 2, 3, 4}, reorder it to {1, 4, 2, 3}. You must do this in-place without
 * altering the nodes' values.
 * 
 * Created by xubai on 15/9/28.
 */
public class ReorderList {
    /**
     * 首先，用一快一慢2个指针，找到链表中间位置；然后，将链表后半部分倒置；最后，合并这2部分。
     * 
     * @param list
     */
    public void reorderList(ListNode list) {
        if (list == null || list.getNext() == null) {
            return;
        }
        ListNode slow = list;
        ListNode fast = list;
        while (fast.getNext() != null && fast.getNext().getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        ListNode p = slow.getNext();
        slow.setNext(null);
        ListNode q = p.getNext();
        p.setNext(null);
        while (q != null) {
            ListNode temp = q.getNext();
            q.setNext(p);
            p = q;
            q = temp;
        }
        ListNode node1 = list;
        ListNode node2 = p;
        while (node2 != null) {
            ListNode temp1 = node1.getNext();
            ListNode temp2 = node2.getNext();
            node1.setNext(node2);
            node2.setNext(temp1);
            node1 = temp1;
            node2 = temp2;
        }
    }
}
