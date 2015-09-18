package xubai.leetcode.list;

import xubai.model.ListNode;

/**
 * Given a singly linked list where elements are sorted in ascending order, convert it to a height
 * balanced BST.
 * 
 * Created by xubai on 15/9/18.
 */
public class ConvertSortedListToBinarySearchTree {
    private ListNode node = null;
    private int length;

    public ConvertSortedListToBinarySearchTree(ListNode node) {
        this.node = node;
        this.length = ListNode.length(node);
    }
    /**
     * 由于输入是链表，无法在常数时间内随机访问，固采用类似前序遍历的方式构建树
     *
     * @return
     */
    public int[] convertSortedListToBinarySearchTree() {
        int[] result = new int[length];
        convertSortedListToBinarySearchTree(result, 0);
        return result;
    }

    private void convertSortedListToBinarySearchTree(int[] tree, int i) {
        if (i >= length) {
            return;
        }
        convertSortedListToBinarySearchTree(tree, i * 2 + 1);
        tree[i] = node.getValue();
        node = node.getNext();
        convertSortedListToBinarySearchTree(tree, i * 2 + 2);
    }
}
