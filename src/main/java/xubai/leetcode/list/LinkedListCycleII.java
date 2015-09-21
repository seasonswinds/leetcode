package xubai.leetcode.list;

import xubai.model.ListNode;

/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * 
 * Follow up: Can you solve it without using extra space?
 * 
 * Created by xubai on 15/9/21.
 */
public class LinkedListCycleII {
    /**
     * 仍采用LinkedListCycle中的方式，假设两指针相遇于P结点，环起始点是S结点。
     * 再假设head到s结点距离为X，s结点到p结点距离为Y，环长度为K；
     * 则，慢指针走过的距离为X + Y + m * K，快指针走过的距离为X + Y + n * K(m,n均为正整数)，
     * 并且2 * (X + Y + m * K) = X + Y + n * K;
     * 化简得(X + Y) = (n - 2m) * K，即head到p结点的距离是环长的整数倍;
     * 又因为s结点到p结点距离为Y，
     * 则，从p结点再走X步，一定回到s结点。
     *
     * 因为X,Y未知，则从head和p结点同时出发，当两条路径交汇时即走过了X步，并且相遇结点就是环起始点。
     * 
     * @param head
     * @return
     */
    public ListNode linkedListCycleII(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            if (fast == slow) {
                break;
            }
        }
        if (fast == null) {
            return null;
        }
        slow = head;
        while (fast != slow) {
            fast = fast.getNext();
            slow = slow.getNext();
        }
        return fast;
    }
}
