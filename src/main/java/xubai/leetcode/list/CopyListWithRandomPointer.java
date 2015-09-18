package xubai.leetcode.list;

import xubai.model.RandomListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * A linked list is given such that each node contains an additional random pointer which could
 * point to any node in the list or null.
 * 
 * Return a deep copy of the list.
 * 
 * Created by xubai on 15/9/18.
 */
public class CopyListWithRandomPointer {
    /**
     * 首先，复制每个结点，并插入原链表中，原结点后方；然后，根据原结点的random域，设置复制结点的random域；最后，将链表分解为2条
     * 
     * @param head
     * @return
     */
    public RandomListNode copyListWithRandomPointer(RandomListNode head) {
        if (head == null) {
            return null;
        }
        RandomListNode node = head;
        while (node != null) {
            RandomListNode temp = new RandomListNode(node.getValue());
            temp.setNext(node.getNext());
            node.setNext(temp);
            node = temp.getNext();
        }
        node = head;
        while (node != null) {
            if (node.getNext() != null) {
                if (node.getRandom() != null) {
                    node.getNext().setRandom(node.getRandom().getNext());
                }
                node = node.getNext().getNext();
            }
        }
        RandomListNode newHead = head.getNext();
        node = head;
        while (node != null) {
            RandomListNode newNode = node.getNext();
            node.setNext(newNode.getNext());
            node = node.getNext();
            if (node != null) {
                newNode.setNext(node.getNext());
            }
        }
        return newHead;
    }

    /**
     * 利用HashMap保存原结点和复制结点的对应关系，方便在复制random域时查找对应的复制结点。
     *
     * @param head
     * @return
     */
    public RandomListNode copyListWithRandomPointer1(RandomListNode head) {
        if (head == null) {
            return null;
        }
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode newHead = new RandomListNode(head.getValue());
        map.put(head, newHead);
        RandomListNode node = head.getNext();
        RandomListNode newNode = newHead;
        while (node != null) {
            RandomListNode temp = new RandomListNode(node.getValue());
            map.put(node, temp);
            newNode.setNext(temp);
            node = node.getNext();
            newNode = temp;
        }
        node = head;
        newNode = newHead;
        while (node != null) {
            if (node.getRandom() != null) {
                newNode.setRandom(map.get(node.getRandom()));
            }
            node = node.getNext();
            newNode = newNode.getNext();
        }
        return newHead;
    }
}
