package xubai.leetcode.binarytree;

import xubai.model.TreeLinkNode;

/**
 * Follow up for problem "Populating Next Right Pointers in Each Node".
 * 
 * What if the given tree could be any binary tree? Would your previous solution still work?
 * 
 * Note:
 * 
 * You may only use constant extra space. For example, Given the following binary tree,
 *
 *      1
 *    /   \
 *   2    3
 *  / \    \
 * 4  5    7
 * 
 * After calling your function, the tree should look like:
 * 
 *       1 -> NULL
 *     /   \
 *    2 -> 3 -> NULL
 *  /  \    \
 * 4 -> 5 -> 7 -> NULL
 * 
 * Created by xubai on 15/10/23.
 */
public class PopulatingNextRightPointersInEachNodeII {
    public void populatingNextRightPointersInEachNodeII(TreeLinkNode root) {
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
