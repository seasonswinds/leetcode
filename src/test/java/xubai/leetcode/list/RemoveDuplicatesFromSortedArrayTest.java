package xubai.leetcode.list;

import org.junit.Test;

import xubai.util.CommonUtil;

import static org.junit.Assert.assertTrue;

/**
 * 输入数组为[1, 1, 1, 2, 2, 3]，预期去重后，返回长度为3，数组变成[1, 2, 3]
 *
 * Created by xubai on 15/9/11.
 */
public class RemoveDuplicatesFromSortedArrayTest {
    private RemoveDuplicatesFromSortedArray o = new RemoveDuplicatesFromSortedArray();
    private int[] array = {1, 1, 1, 2, 2, 3};

    @Test
    public void test() {
        int newLength = o.removeDuplicatesFromSortedArray(array);
        assertTrue(newLength == 3);
        assertTrue("1, 2, 3".equals(CommonUtil.arrayToString(array, newLength)));
    }
}
