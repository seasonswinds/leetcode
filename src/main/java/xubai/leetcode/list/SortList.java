package xubai.leetcode.list;

import xubai.model.ListNode;

/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 * 
 * Created by xubai on 15/9/30.
 */
public class SortList {
    private MergeTwoSortedLists o = new MergeTwoSortedLists();

    public ListNode sortList(ListNode list) {
        if (list == null || list.getNext() == null) {
            return list;
        }
        ListNode slow = list;
        ListNode fast = list.getNext();
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        ListNode list1 = list;
        ListNode list2 = slow.getNext();
        slow.setNext(null);
        list1 = sortList(list1);
        list2 = sortList(list2);
        return o.mergeTwoSortedLists(list1, list2);
    }
}
