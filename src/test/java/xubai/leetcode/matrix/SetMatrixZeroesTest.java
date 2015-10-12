package xubai.leetcode.matrix;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import xubai.util.CommonUtil;

/**
 * 输入矩阵：|1, 1, 1, 1, 1|，预期输出为：|1, 0, 1, 0, 1|
 *          |1, 0, 1, 0, 1|            |0, 0, 0, 0, 0|
 *          |1, 1, 1, 1, 1|            |1, 0, 1, 0, 1|
 *
 * Created by xubai on 15/10/12.
 */
public class SetMatrixZeroesTest {
    private SetMatrixZeroes o = new SetMatrixZeroes();
    private int[][] matrix = { {1, 1, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 1, 1, 1, 1}};

    @Test
    public void test() {
        o.setMatrixZeroes(matrix);
        assertTrue(("1, 0, 1, 0, 1\n" +
                    "0, 0, 0, 0, 0\n" +
                    "1, 0, 1, 0, 1\n").equals(CommonUtil.matrixToString(matrix)));
    }
}
