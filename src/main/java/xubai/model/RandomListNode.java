package xubai.model;

import java.util.HashMap;
import java.util.Map;

/**
 * 比链表增加了一个random域，有可能指向null或者链表中任意一个节点。
 *
 * Created by xubai on 15/9/18.
 */

public class RandomListNode {
    private final int value;
    private RandomListNode next;
    private RandomListNode random;

    public RandomListNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public RandomListNode getNext() {
        return next;
    }

    public void setNext(RandomListNode next) {
        this.next = next;
    }

    public RandomListNode getRandom() {
        return random;
    }

    public void setRandom(RandomListNode random) {
        this.random = random;
    }

    /**
     * 根据randoms数组构建链表，randoms数组中的值表示链表结点的random域指向的结点在链表中的位置，若为-1则random域为null
     * 
     * @param randoms
     * @return
     */
    public static RandomListNode createRandomLinkedList(int[] randoms) {
        if (randoms == null || randoms.length == 0) {
            return null;
        }
        RandomListNode[] array = new RandomListNode[randoms.length];
        RandomListNode head = new RandomListNode(1);
        RandomListNode node = head;
        for (int i = 1; i < randoms.length; i++) {
            RandomListNode temp = new RandomListNode(i + 1);
            node.setNext(temp);
            node = temp;
            array[i] = node;
        }
        node = head;
        for (int i = 0; i < randoms.length; i++) {
            if (randoms[i] > -1 && randoms[i] < array.length) {
                node.random = array[randoms[i]];
            }
            node = node.getNext();
        }
        return head;
    }

    /**
     * 将链表中每个结点的random域指向的结点在链表中的位置转化为数组，如果random域为null，则该对应的值为-1
     * 
     * @param head
     * @return
     */
    public static int[] getRandomArray(RandomListNode head) {
        Map<RandomListNode, Integer> map = new HashMap<RandomListNode, Integer>();
        int i = 0;
        RandomListNode node = head;
        while (node != null) {
            map.put(node, i);
            i++;
            node = node.getNext();
        }
        int[] result = new int[map.size()];
        i = 0;
        node = head;
        while (node != null) {
            RandomListNode randomNode = node.getRandom();
            if (randomNode == null) {
                result[i] = -1;
            } else {
                result[i] = map.get(randomNode);
            }
            i++;
            node = node.getNext();
        }
        return result;
    }
}
