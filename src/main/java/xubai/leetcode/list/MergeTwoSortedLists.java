package xubai.leetcode.list;

import xubai.model.ListNode;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by
 * splicing together the nodes of the first two lists.
 * 
 * Created by xubai on 15/9/22.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoSortedLists(ListNode listA, ListNode listB) {
        ListNode fakeHead = new ListNode(0);
        ListNode nodeA = listA;
        ListNode nodeB = listB;
        ListNode node = fakeHead;
        while (nodeA != null && nodeB != null) {
            ListNode nextNode;
            if (nodeA.getValue() < nodeB.getValue()) {
                nextNode = nodeA;
                nodeA = nodeA.getNext();
            } else {
                nextNode = nodeB;
                nodeB = nodeB.getNext();
            }
            node.setNext(nextNode);
            node = nextNode;
        }
        if (nodeA != null) {
            node.setNext(nodeA);
        }
        if (nodeB != null) {
            node.setNext(nodeB);
        }
        return fakeHead.getNext();
    }
}
