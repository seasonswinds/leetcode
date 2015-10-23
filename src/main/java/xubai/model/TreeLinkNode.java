package xubai.model;

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
