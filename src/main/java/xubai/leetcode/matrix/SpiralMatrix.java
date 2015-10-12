package xubai.leetcode.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral
 * order.
 * 
 * For example, given the following matrix:
 * 
 * |1, 2, 3| You should return {1, 2, 3, 6, 9, 8, 7, 4, 5}.
 * |4, 5, 6|
 * |7, 8, 9|
 * 
 * Created by xubai on 15/10/12.
 */
public class SpiralMatrix {
    /**
     * 将整个过程按照方向拆解为4个部分。
     *
     * 1.需要注意剩余个数与数组下标遍历的不同。
     * 2.在每个方向遍历时，只遍历到倒数第二个元素，可以使得代码更加简练。
     *
     * @param matrix
     * @return
     */
    public List<Integer> spiralMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<Integer>(0);
        }
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<Integer>(m * n);
        int x = 0;
        int y = 0;
        while (m > 0 && n > 0) {
            if (m == 1 && n == 1) {
                result.add(matrix[x][y]);
                break;
            }
            for (int i = 0; i < n - 1; i++) {
                result.add(matrix[x][y++]);
            }
            for (int i = 0; i < m - 1; i++) {
                result.add(matrix[x++][y]);
            }
            for (int i = 0; i < n - 1; i++) {
                result.add(matrix[x][y--]);
            }
            for (int i = 0; i < m - 1; i++) {
                result.add(matrix[x--][y]);
            }
            x++;
            y++;
            m -= 2;
            n -= 2;
        }
        return result;
    }
}
