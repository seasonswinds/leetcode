package xubai.leetcode.list;

import xubai.model.ListNode;

/**
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes
 * greater than or equal to x.
 * 
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * 
 * For example, given 1 -> 4 -> 3 -> 2 -> 5 -> 2 and x = 3, return 1 -> 2 -> 2 -> 4 -> 3 -> 5.
 * 
 * Created by xubai on 15/9/23.
 */
public class PartitionList {
    public ListNode partitionList(ListNode list, int x) {
        if (list == null) {
            return null;
        }
        ListNode fakeHeadLittle = new ListNode(0);
        ListNode fakeHeadLarger = new ListNode(0);

        ListNode start = list;
        ListNode node = list;
        ListNode little = fakeHeadLittle;
        ListNode larger = fakeHeadLarger;
        boolean isSmall = node.getValue() < x;
        while(node != null) {
            ListNode next = node.getNext();
            if (next != null && (next.getValue() < x == isSmall)) {
            } else if (isSmall) {
                little.setNext(start);
                little = node;
                start = next;
                isSmall = false;
            } else {
                larger.setNext(start);
                larger = node;
                start = next;
                isSmall = true;
            }
            node = next;
        }
        larger.setNext(null);
        little.setNext(fakeHeadLarger.getNext());
        return fakeHeadLittle.getNext();
    }
}
