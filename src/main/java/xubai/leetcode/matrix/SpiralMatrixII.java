package xubai.leetcode.matrix;

/**
 * Given an integer n, generate a square matrix filled with elements from 1 to n² in spiral order.
 * For example, given n = 4,
 * 
 * | 1,  2,  3,  4|
 * |12, 13, 14,  5|
 * |11, 16, 15,  6|
 * |10,  9,  8,  7|
 * 
 * Created by xubai on 15/10/12.
 */
public class SpiralMatrixII {
    public int[][] spiralMatrixII(int n) {
        int[][] matrix = new int[n][n];
        int value = 1;
        int x = 0;
        int y = 0;
        while (n > 0) {
            if (n == 1) {
                matrix[x][y] = value;
                break;
            }
            for (int i = 0 ; i < n - 1 ; i++) {
                matrix[x][y++] = value++;
            }
            for (int i = 0 ; i < n - 1 ; i++) {
                matrix[x++][y] = value++;
            }
            for (int i = 0 ; i < n - 1 ; i++) {
                matrix[x][y--] = value++;
            }
            for (int i = 0 ; i < n - 1 ; i++) {
                matrix[x--][y] = value++;
            }
            x++;
            y++;
            n-=2;
        }
        return matrix;
    }
}
