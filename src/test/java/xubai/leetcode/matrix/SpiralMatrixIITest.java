package xubai.leetcode.matrix;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import xubai.util.CommonUtil;

/**
 * 输入：n = 4，预期输出为：| 1,  2,  3,  4|
 *                       |12, 13, 14,  5|
 *                       |11, 16, 15,  6|
 *                       |10,  9,  8,  7|
 *
 * Created by xubai on 15/10/12.
 */
public class SpiralMatrixIITest {
    private SpiralMatrixII o = new SpiralMatrixII();
    private int n = 4;

    @Test
    public void test() {
        int[][] matrix = o.spiralMatrixII(n);
        System.out.println(CommonUtil.matrixToString(matrix));
        assertTrue(("1, 2, 3, 4\n" +
                    "12, 13, 14, 5\n" +
                    "11, 16, 15, 6\n" +
                    "10, 9, 8, 7\n").equals(CommonUtil.matrixToString(matrix)));
    }
}
