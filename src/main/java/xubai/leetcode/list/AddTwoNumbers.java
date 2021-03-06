package xubai.leetcode.list;

import xubai.model.ListNode;

/**
 * You are given two linked lists representing two non-negative numbers. The digits are stored in
 * reverse order and each of their nodes contain a single digit. Add the two numbers and return it
 * as a linked list.
 * 
 * Created by xubai on 15/9/15.
 */
public class AddTwoNumbers {
    /**
     * 由于输入列表是逆序排列，直接遍历两个列表，相同的位相加，需要进位则向后一位加一。
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTowNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode node = null;
        int carryBit = 0;
        while (l1 != null || l2 != null || carryBit != 0) {
            int sum = carryBit;
            if (l1 != null) {
                sum = sum + l1.getValue();
                l1 = l1.getNext();
            }
            if (l2 != null) {
                sum = sum + l2.getValue();
                l2 = l2.getNext();
            }
            carryBit = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            if (result == null) {
                result = newNode;
            }
            if (node != null) {
                node.setNext(newNode);
            }
            node = newNode;
        }
        return result;
    }
}
