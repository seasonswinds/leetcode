package xubai.leetcode.binarytree;

import xubai.model.TreeLinkNode;

/**
 * Given a binary tree
 * 
 * struct TreeLinkNode {
 *     TreeLinkNode *left;
 *     TreeLinkNode *right;
 *     TreeLinkNode *next;
 * }
 * 
 * Populate each next pointer to point to its next right node. If there is no next right node, the
 * next pointer should be set to NULL.
 * 
 * Initially, all next pointers are set to NULL.
 * 
 * Note:
 * 
 * You may only use constant extra space. You may assume that it is a perfect binary tree (ie, all
 * leaves are at the same level, and every parent has two children). For example, Given the
 * following perfect binary tree,
 * 
 *      1
 *    /   \
 *   2    3
 *  / \  / \
 * 4  5 6  7
 * 
 * After calling your function, the tree should look like:
 * 
 *          1 -> NULL
 *      /       \
 *     2   ->   3 -> NULL
 *  /   \     /   \
 * 4 -> 5 -> 6 -> 7 -> NULL
 * 
 * Created by xubai on 15/10/23.
 */
public class PopulatingNextRightPointersInEachNode {
    /**
     * 递归
     *
     * @param root
     */
    public void populatingNextRightPointersInEachNode(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        if (root.getRight() != null) {
            if (root.getNext() != null) {
                root.getRight().setNext(root.getNext().getLeft());
            }
            if (root.getLeft() != null) {
                root.getLeft().setNext(root.getRight());
            }
        }
        populatingNextRightPointersInEachNode(root.getLeft());
        populatingNextRightPointersInEachNode(root.getRight());
    }

    /**
     * 非递归
     *
     * 采用按层次顺序遍历，将每层看成一个链表，根节点的层级只有一个节点，可以认为已经添加完链接。
     * 在遍历每层时将下一层链接起来，遍历下一层是，从本层链接成的链表头部开始即可。
     *
     * @param root
     */
    public void populatingNextRightPointersInEachNode1(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        TreeLinkNode node = root;
        while (node != null) {
            TreeLinkNode nextLevelFakeHead = new TreeLinkNode(0);
            TreeLinkNode nextLevelList = nextLevelFakeHead;
            while (node != null) {
                if (node.getLeft() != null) {
                    nextLevelList.setNext(node.getLeft());
                    nextLevelList = nextLevelList.getNext();
                }
                if (node.getRight() != null) {
                    nextLevelList.setNext(node.getRight());
                    nextLevelList = nextLevelList.getNext();
                }
                node = node.getNext();
            }
            node = nextLevelFakeHead.getNext();
        }
    }
}
