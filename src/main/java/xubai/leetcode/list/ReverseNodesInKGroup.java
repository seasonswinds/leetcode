package xubai.leetcode.list;

import xubai.model.ListNode;

/**
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 * 
 * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it
 * is.
 * 
 * You may not alter the values in the nodes, only nodes itself may be changed.
 * 
 * Only constant memory is allowed.
 * 
 * For example, Given this linked list: 1 -> 2 -> 3 -> 4 -> 5
 * 
 * For k = 2, you should return: 2 -> 1 -> 4 -> 3 -> 5
 * 
 * For k = 3, you should return: 3 -> 2 -> 1 -> 4 -> 5
 * 
 * Created by xubai on 15/9/29.
 */
public class ReverseNodesInKGroup {
    public ListNode reverseNodesInKGroup(ListNode list, int k) {
        if (list == null || list.getNext() == null) {
            return list;
        }
        ListNode groupHead = list;
        ListNode fakeHead = new ListNode(0);
        fakeHead.setNext(list);
        ListNode pre = fakeHead;
        while (true) {
            ListNode test = groupHead;
            for (int i = 0 ; i < k ; i++) {
                if (test == null) {
                    return fakeHead.getNext();
                }
                test = test.getNext();
            }
            ListNode p = groupHead;
            ListNode q = groupHead.getNext();
            for (int i = 1; i < k && q != null ; i++) {
                ListNode temp = q.getNext();
                q.setNext(p);
                p = q;
                q = temp;
            }
            groupHead.setNext(q);
            pre.setNext(p);
            pre = groupHead;
            groupHead = q;
        }
    }
}
