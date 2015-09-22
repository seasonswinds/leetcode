package xubai.leetcode.list;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import xubai.model.ListNode;

/**
 * 输入listA:1 -> 4 -> 10，listB:2 -> 5 -> 8 -> 11 -> 14，listC:3 -> 6
 * 合并后，预期输出为1 -> 2 —> 3 -> 4 -> 5 -> 6 -> 8 -> 10 -> 11 -> 14
 *
 * Created by xubai on 15/9/22.
 */
public class MergeKSortedListsTest {
    private MergeKSortedLists o = new MergeKSortedLists();
    private List<ListNode> lists;

    @Before
    public void setUp() {
        lists = new ArrayList<ListNode>(3);
        lists.add(ListNode.createLinkedList(new int[] {1, 4, 10}));
        lists.add(ListNode.createLinkedList(new int[] {2, 5, 8, 11, 14}));
        lists.add(ListNode.createLinkedList(new int[] {3, 6}));
    }

    @Test
    public void test() {
        ListNode newList = o.mergeKSortedLists(lists);
        assertTrue("1, 2, 3, 4, 5, 6, 8, 10, 11, 14".equals(ListNode.output(newList)));
    }
}
