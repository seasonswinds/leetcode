package xubai.model;

import xubai.util.CommonUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 带链接的二叉树
 *
 * Created by xubai on 15/10/23.
 */
public class TreeLinkNode {
    private final int value;
    private TreeLinkNode left;
    private TreeLinkNode right;
    private TreeLinkNode next;

    public TreeLinkNode(int value) {
        this.value = value;
    }

    public static TreeLinkNode createTree(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return createTree(array, 0);
    }

    private static TreeLinkNode createTree(int[] array, int index) {
        if (index > array.length - 1 || array[index] == -1) {
            return null;
        }
        TreeLinkNode root = new TreeLinkNode(array[index]);
        root.setLeft(createTree(array, index * 2 + 1));
        root.setRight(createTree(array, index * 2 + 2));
        return root;
    }

    public static String levelOrderToString(TreeLinkNode root) {
        if (root == null) {
            return "";
        }
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        LinkedList<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.add(root);
        queue.add(null);
        boolean isFirstNodeOfLevel = true;
        while (!queue.isEmpty()) {
            TreeLinkNode node = queue.pop();
            if (node == null) {
                if (!queue.isEmpty()) {
                    queue.add(null);
                    isFirstNodeOfLevel = true;
                }
            } else {
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
                if (isFirstNodeOfLevel) {
                    TreeLinkNode p = node;
                    List<Integer> list = new ArrayList<Integer>();
                    while (p != null) {
                        list.add(p.getValue());
                        p = p.getNext();
                    }
                    lists.add(list);
                    isFirstNodeOfLevel = false;
                }
            }
        }
        return CommonUtil.listToString(lists);
    }

    public int getValue() {
        return value;
    }

    public TreeLinkNode getLeft() {
        return left;
    }

    public void setLeft(TreeLinkNode left) {
        this.left = left;
    }

    public TreeLinkNode getRight() {
        return right;
    }

    public void setRight(TreeLinkNode right) {
        this.right = right;
    }

    public TreeLinkNode getNext() {
        return next;
    }

    public void setNext(TreeLinkNode next) {
        this.next = next;
    }
}
