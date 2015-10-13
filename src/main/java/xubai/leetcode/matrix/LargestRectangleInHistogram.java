package xubai.leetcode.matrix;

import java.util.Stack;

/**
 * Given n non-negative integers representing the histogram's bar height where the width of each bar
 * is 1, find the area of largest rectangle in the histogram.
 *
 * For example, given height = [2, 1, 5, 6, 2, 3], return 10.
 *
 * Created by xubai on 15/10/12.
 */
public class LargestRectangleInHistogram {
    /**
     * 用栈记录每个高度对应的最大宽度。
     * 当前方的元素比自己小时，就可以计算这个高度对应的最大面积，最后从各个高度对应的面积中找出最大值。
     *
     * @param array
     * @return
     */
    public int largestRectangleInHistogram(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        int i = 0;
        while (i <= array.length) {
            int height = i == array.length ? 0 :array[i];
            if (stack.isEmpty() || height >= array[stack.peek()]) {
                stack.push(i);
                i++;
            } else {
                int index = stack.pop();
                int h = array[index];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(h * w, max);
            }

        }
        return max;
    }
}
