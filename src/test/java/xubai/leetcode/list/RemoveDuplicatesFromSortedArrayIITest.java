package xubai.leetcode.list;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import xubai.util.CommonUtil;

/**
 * 输入数组为[1, 1, 1, 1, 2, 2, 2, 3, 3]，预期去重后，返回长度为6，数组变成[1, 1, 2, 2, 3, 3]
 * 
 * Created by xubai on 15/9/11.
 */
public class RemoveDuplicatesFromSortedArrayIITest {
    private RemoveDuplicatesFromSortedArrayII o = new RemoveDuplicatesFromSortedArrayII();
    private int[] array = {1, 1, 1, 1, 2, 2, 2, 3, 3};

    @Test
    public void test() {
        int newLength = o.removeDuplicatesFromSortedArrayII(array);
        assertTrue(newLength == 6);
        assertTrue("1, 1, 2, 2, 3, 3".equals(CommonUtil.arrayToString(array, newLength)));
    }
}
