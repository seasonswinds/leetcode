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
        ListNode head = null;
        for (int i = array.length - 1; i >= 0; i--) {
            ListNode node = new ListNode(array[i]);
            node.setNext(head);
            head = node;
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
}
