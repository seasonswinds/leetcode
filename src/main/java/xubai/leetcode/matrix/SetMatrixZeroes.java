package xubai.leetcode.matrix;

/**
 * Given a m × n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 * Follow up: Did you use extra space? A straight forward solution using O(mn) space is probably a
 * bad idea. A simple improvement uses O(m + n) space, but still not the best solution. Could you
 * devise a constant space solution?
 * 
 * Created by xubai on 15/10/12.
 */
public class SetMatrixZeroes {
    /**
     * 当matrix[i][0] == 0或者matrix[0][j] == 0时，对应的列或者行需要被设置为0；
     * 当matrix[i][j] == 0时，matrix[i][0]和matrix[0][j]需要被设置为0；
     * 因此可以使用第一行和第一列来记录该列或者行是否需要被设置为0；
     * 再使用2个boolean值记录第一行和第一列是否需要被设置为0。
     *
     * @param matrix
     */
    public void setMatrixZeroes(int[][] matrix) {
        int m = matrix[0].length;
        int n = matrix.length;
        boolean isFirstRowZero = false;
        boolean isFirstColumnZero = false;
        for (int i = 0; i < m; i++) {
            if (matrix[0][i] == 0) {
                isFirstRowZero = true;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                isFirstColumnZero = true;
                break;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (isFirstRowZero) {
            for (int i = 0; i < m; i++) {
                matrix[0][i] = 0;
            }
        }
        if (isFirstColumnZero) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
