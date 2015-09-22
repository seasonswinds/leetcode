package xubai.leetcode.list;

import java.util.List;

import xubai.model.ListNode;

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its
 * complexity.
 * 
 * Created by xubai on 15/9/22.
 */
public class MergeKSortedLists {
    /**
     * 建立一个与链表数量相同大小的堆，循环将堆顶元素插入新链表中，并置换为该结点的后置结点，如果后置结点为null，则删除这个堆结点。
     *
     * @param lists
     * @return
     */
    public ListNode mergeKSortedLists(List<ListNode> lists) {
        ListNode[] heap = new ListNode[lists.size()];
        int heapSize = 0;
        for (int i = 0; i < lists.size(); i++) {
            ListNode list = lists.get(i);
            if (list != null) {
                heap[i] = list;
                heapSize++;
            }
        }
        createHeap(heap, heapSize);
        ListNode fakeHead = new ListNode(0);
        ListNode node = fakeHead;
        while (heapSize > 1) {
            ListNode temp = heap[0];
            node.setNext(temp);
            if (temp.getNext() == null) {
                removeTopOfHeap(heap, heapSize);
                heapSize--;
            } else {
                heap[0] = temp.getNext();
            }
            heapSortByOneStep(heap, 0, heapSize);
            node = node.getNext();
        }
        node.setNext(heap[0]);
        return fakeHead.getNext();
    }

    private void heapSortByOneStep(ListNode[] heap, int start, int size) {
        for (int i = start; i < size / 2; i++) {
            int minIndex = i;
            ListNode temp = heap[i];
            if (heap[i * 2 + 1].getValue() < temp.getValue()) {
                minIndex = i * 2 + 1;
            }
            if (i * 2 + 2 < size && heap[i * 2 + 2].getValue() < heap[minIndex].getValue()) {
                minIndex = i * 2 + 2;
            }
            heap[i] = heap[minIndex];
            heap[minIndex] = temp;
        }
    }

    private void removeTopOfHeap(ListNode[] heap, int size) {
        heap[0] = heap[size - 1];
        heap[size - 1] = null;
    }

    private void createHeap(ListNode[] heap, int size) {
        for (int i = size / 2; i >= 0; i--) {
            heapSortByOneStep(heap, i, size);
        }
    }
}
