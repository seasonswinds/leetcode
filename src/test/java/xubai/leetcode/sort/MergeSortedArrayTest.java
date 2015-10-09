package xubai.leetcode.sort;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import xubai.util.CommonUtil;

/**
 * 输入arrayA：{1, 3, 9}，m = 3，arrayB：{2, 4, 6, 8}，n = 4；预期输出为{1, 2, 3, 4, 6, 8, 9}
 * 
 * Created by xubai on 15/10/9.
 */
public class MergeSortedArrayTest {
    private MergeSortedArray o = new MergeSortedArray();
    private int[] arrayA;
    private int m;
    private int[] arrayB;
    private int n;

    @Before
    public void setUp() {
        m = 3;
        n = 4;
        arrayA = new int[m + n];
        arrayA[0] = 1;
        arrayA[1] = 3;
        arrayA[2] = 9;
        arrayB = new int[] {2, 4, 6, 8};
    }

    @Test
    public void test() {
        o.mergeSortedArray(arrayA, m, arrayB, n);
        assertTrue("1, 2, 3, 4, 6, 8, 9".equals(CommonUtil.arrayToString(arrayA)));
    }
}
