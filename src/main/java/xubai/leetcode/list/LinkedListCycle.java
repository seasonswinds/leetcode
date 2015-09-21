package xubai.leetcode.list;

import xubai.model.ListNode;

/**
 * Given a linked list, determine if it has a cycle in it.
 * 
 * Created by xubai on 15/9/21.
 */
public class LinkedListCycle {
    /**
     * 用一快一慢两个指针，快指针一次循环前进两个结点，慢指针一次循环前进一个结点，如果两个指针指向同一个结点则链表有环；
     * 如果链表无环，则快指针或者快指针的下一个结点会率先为null。
     * 
     * @param head
     * @return
     */
    public boolean linkedListCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
