package xubai.leetcode.list;

import static junit.framework.Assert.assertTrue;

import org.junit.Test;

import xubai.util.CommonUtil;

/**
 * ��������Ϊ[1, 1, 1, 2, 2, 3]��Ԥ��ȥ�غ󣬷��س���Ϊ3��������[1, 2, 3]
 *
 * Created by xubai on 15/9/11.
 */
public class RemoveDuplicatesFromSortedArrayTest {
    private int[] array = {1, 1, 1, 2, 2, 3};

    @Test
    public void test() {
        int newLength = RemoveDuplicatesFromSortedArray.removeDuplicatesFromSortedArray(array);
        assertTrue(newLength == 3);
        assertTrue("1, 2, 3".equals(CommonUtil.arrayToString(array, newLength)));
    }
}
