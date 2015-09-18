package xubai.leetcode.list;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xubai.model.RandomListNode;
import xubai.util.CommonUtil;

/**
 * 输入为1    -> 2    -> 3 -> 4 -> 5 -> 6 -> 7
 *      null    null    7    3    4    1    null
 *
 * 预期拷贝结果与输入结构完全相同
 * 
 * Created by xubai on 15/9/18.
 */
public class CopyListWithRandomPointerTest {
    private CopyListWithRandomPointer o = new CopyListWithRandomPointer();
    private RandomListNode head;

    @Before
    public void setUp() {
        int[] random = {-1, -1, 6, 2, 3, 0, -1};
        head = RandomListNode.createRandomLinkedList(random);
    }

    @Test
    public void test() {
        int[] array = RandomListNode.getRandomArray(head);
        RandomListNode newHead = o.copyListWithRandomPointer(head);
        int[] newArray = RandomListNode.getRandomArray(newHead);
        assertTrue(CommonUtil.arrayToString(array).equals(CommonUtil.arrayToString(newArray)));
        RandomListNode newHead1 = o.copyListWithRandomPointer1(head);
        int[] newArray1 = RandomListNode.getRandomArray(newHead1);
        assertTrue(CommonUtil.arrayToString(array).equals(CommonUtil.arrayToString(newArray1)));
    }
}
