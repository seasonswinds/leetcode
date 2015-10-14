package xubai.model;

/**
 * 二叉树
 *
 * Created by xubai on 15/10/14.
 */
public class TreeNode {
    private final int value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public static TreeNode createTree(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return createTree(array, 0);
    }

    private static TreeNode createTree(int[] array, int index) {
        if (index > array.length - 1 || array[index] == -1) {
            return null;
        }
        TreeNode root = new TreeNode(array[index]);
        root.setLeft(createTree(array, index * 2 + 1));
        root.setRight(createTree(array, index * 2 + 2));
        return root;
    }

    public int getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
