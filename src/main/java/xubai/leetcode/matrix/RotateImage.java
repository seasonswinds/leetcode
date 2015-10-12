package xubai.leetcode.matrix;

/**
 * You are given an n × n 2D matrix representing an image. Rotate the image by 90 degrees
 * (clockwise). Follow up: Could you do this in-place?
 * 
 * Created by xubai on 15/10/12.
 */
public class RotateImage {
    /**
     * 先将矩阵转置，再左右反转，就可以实现顺时针旋转90°
     * 
     * @param array
     */
    public void rotateImage(int[][] array) {
        if (array == null || array.length == 0 || array.length != array[0].length) {
            throw new RuntimeException("The image is error!");
        }
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (i != j) {
                    int temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = array[i][left];
                array[i][left] = array[i][right];
                array[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
