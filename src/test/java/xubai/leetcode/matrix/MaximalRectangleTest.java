package xubai.leetcode.matrix;

import org.junit.Test;

/**
 * 输入矩阵：|1, 1, 0, 1, 1, 0|，预期输出为8。
 *          |1, 0, 1, 1, 1, 1|
 *          |0, 0, 1, 1, 1, 1|
 *          |0, 1, 1, 0, 0, 1|
 *
 * Created by xubai on 15/10/12.
 */
public class MaximalRectangleTest {
    private MaximalRectangle o = new MaximalRectangle();
    private int[][] matrix = {{1, 1, 0, 1, 1, 0}, {1, 0, 1, 1, 1, 1}, {0, 0, 1, 1, 1, 1}, {0, 1, 1, 0, 0, 1}};

    @Test
    public void test() {
        int result = o.maximalRectangle(matrix);
        System.out.println(result);
    }
}
