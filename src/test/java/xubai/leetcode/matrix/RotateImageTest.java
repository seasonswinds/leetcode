package xubai.leetcode.matrix;

import org.junit.Test;
import xubai.util.CommonUtil;

import static org.junit.Assert.assertTrue;

/**
 * 输入矩阵：|1, 2, 3|，预期输出为：|7, 4, 1|
 *         |4, 5, 6|            |8, 5, 2|
 *         |7, 8, 9|            |9, 6, 3|
 *
 * Created by xubai on 15/10/12.
 */
public class RotateImageTest {
    private RotateImage o = new RotateImage();
    private int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    @Test
    public void test() {
        o.rotateImage(matrix);
        assertTrue("7, 4, 1\n8, 5, 2\n9, 6, 3\n".equals(CommonUtil.matrixToString(matrix)));
    }
}
