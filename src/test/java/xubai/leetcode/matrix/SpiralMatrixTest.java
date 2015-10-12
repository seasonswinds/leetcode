package xubai.leetcode.matrix;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import xubai.util.CommonUtil;

import java.util.List;

/**
 * 输入矩阵：|1, 2, 3|，预期输出：{1, 2, 3, 6, 9, 8, 7, 4, 5}。
 *          |4, 5, 6|
 *          |7, 8, 9|
 *
 * Created by xubai on 15/10/12.
 */
public class SpiralMatrixTest {
    private SpiralMatrix o = new SpiralMatrix();
    private int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    @Test
    public void test() {
        List<Integer> result = o.spiralMatrix(matrix);
        System.out.println(CommonUtil.listToString(result));
        assertTrue("1, 2, 3, 6, 9, 8, 7, 4, 5".equals(CommonUtil.listToString(result)));
    }
}
