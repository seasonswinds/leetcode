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
     * �����󻮷�Ϊ��ǰ1�С�ǰ2�� ���� ǰn - 1�С�n�е�n������
     * �ٽ���N������ת��Ϊ����LargestRectangleInHistogram�еĸ߶����飻
     * �罫��|1, 1, 0, 1, 1, 0|��ת��Ϊ��|1, 1, 0, 1, 1, 0|
     *      |1, 0, 1, 1, 1, 1|         |2, 0, 1, 2, 2, 1|
     *      |0, 0, 1, 1, 1, 1|         |0, 0, 2, 3, 3, 2|
     *      |0, 1, 1, 0, 0, 1|         |0, 1, 3, 0, 0, 3|
     * ת����ÿ�ж��ǵ�һ�е�������ɾ�����ֵΪ1��Ԫ����ɵĸ߶ȡ�
     *
     * ʹ��LargestRectangleInHistogram�е��㷨���ÿ�е�������ֵ��������������ֵ���ɡ�
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
