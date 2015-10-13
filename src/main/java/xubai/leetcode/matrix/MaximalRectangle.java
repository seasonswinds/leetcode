package xubai.leetcode.matrix;

import java.util.Stack;

/**
 * Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing all ones
 * and return its area.
 * 
 * Created by xubai on 15/10/12.
 */
public class MaximalRectangle {
    /**
     * 将矩阵划分为由前1行、前2行 …… 前n - 1行、n行等n个矩阵；
     * 再将这N个矩阵转化为类似LargestRectangleInHistogram中的高度数组；
     * 如将：|1, 1, 0, 1, 1, 0|，转化为：|1, 1, 0, 1, 1, 0|
     *      |1, 0, 1, 1, 1, 1|         |2, 0, 1, 2, 2, 1|
     *      |0, 0, 1, 1, 1, 1|         |0, 0, 2, 3, 3, 2|
     *      |0, 1, 1, 0, 0, 1|         |0, 1, 3, 0, 0, 3|
     * 转化后，每行都是第一行到改行组成矩阵中值为1的元素组成的高度。
     *
     * 使用LargestRectangleInHistogram中的算法求出每行的面积最大值，再求出其中最大值即可。
     *
     * @param matrix
     * @return
     */
    public int maximalRectangle(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] height = new int[m][n + 1];
        int maxArea = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    height[i][j] = 0;
                } else {
                    height[i][j] = i == 0 ? 1 : height[i - 1][j] + 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            int area = maxAreaInHist(height[i]);
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }

    private int maxAreaInHist(int[] height) {
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        int max = 0;
        while (i < height.length) {
            if (stack.isEmpty() || height[stack.peek()] <= height[i]) {
                stack.push(i++);
            } else {
                int t = stack.pop();
                max = Math.max(max, height[t] * (stack.isEmpty() ? i : i - stack.peek() - 1));
            }
        }
        return max;
    }
}
