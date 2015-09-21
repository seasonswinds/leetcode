package xubai.leetcode.list;

import java.util.HashMap;
import java.util.Map;

/**
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the
 * following operations: get and set.
 * 
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache,
 * otherwise return -1.
 * 
 * set(key, value) - Set or insert the value if the key is not already present. When the cache
 * reached its capacity, it should invalidate the least recently used item before inserting a new
 * item.
 * 
 * Created by xubai on 15/9/21.
 */
public class LRUCache {
    private int capacity;
    private Map<Integer, Node> map;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<Integer, Node>(capacity);
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.pre = head;
    }

    public void set(int key, int value) {
        Node temp;
        if (map.containsKey(key)) {
            temp = map.get(key);
            removeNode(temp);
        } else {
            temp = new Node();
            temp.key = key;
            temp.value = value;
            if (map.size() == capacity) {
                map.remove(tail.pre.key);
                removeFromTail();
            }
            map.put(key, temp);
        }
        addAfterHead(temp);
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node temp = map.get(key);
            removeNode(temp);
            addAfterHead(temp);
            return temp.value;
        } else {
            return -1;
        }
    }

    private void removeNode(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private void removeFromTail() {
        tail.pre.pre.next = tail;
        tail.pre = tail.pre.pre;
    }

    private void addAfterHead(Node node) {
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }

    private class Node {
        int key;
        int value;
        Node pre;
        Node next;
    }
}
