package xubai.model;

/**
 * 链表
 *
 * Created by xubai on 15/9/18.
 */
public class ListNode {
    private int value;
    private ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public static ListNode createLinkedList(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        ListNode head = new ListNode(array[0]);
        ListNode node = head;
        for (int i = 1; i < array.length; i++) {
            ListNode temp = new ListNode(array[i]);
            node.setNext(temp);
            node = temp;
        }
        return head;
    }

    public static int length(ListNode node) {
        int length = 0;
        while (node != null) {
            length++;
            node = node.getNext();
        }
        return length;
    }

    public static String output(ListNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.getValue()).append(", ");
            node = node.getNext();
        }
        return sb.substring(0, sb.length() - 2);
    }

    public static void addCycle(ListNode head, int index) {
        ListNode node = head;
        ListNode cycleHead = null;
        ListNode cycleTail = null;
        for (int i = 0; node != null; i++, node = node.getNext()) {
            if (i == index) {
                cycleTail = node;
            }
            if (node.getNext() == null) {
                cycleHead = node;
            }
        }
        if (cycleHead != null) {
            cycleHead.setNext(cycleTail);
        }
    }
}
