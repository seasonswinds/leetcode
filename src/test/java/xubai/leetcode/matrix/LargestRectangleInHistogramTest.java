package xubai.leetcode.matrix;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 输入：{2, 1, 5, 6, 2, 3}，预期结果为10
 *
 * Created by xubai on 15/10/12.
 */
public class LargestRectangleInHistogramTest {
    private LargestRectangleInHistogram o = new LargestRectangleInHistogram();
    private int[] array = {2, 1, 5, 6, 2, 3};

    @Test
    public void test() {
        int result = o.largestRectangleInHistogram(array);
        assertTrue(result == 10);
    }
}
