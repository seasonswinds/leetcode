package xubai.leetcode.sort;

import java.util.Arrays;

/**
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given
 * number, target. Return the sum of the three integers. You may assume that each input would have
 * exactly one solution.
 * 
 * For example, given array S = {-1 2 1 -4}, and target = 1. The sum that is closest to the target
 * is 2. (-1 + 2 + 1 = 2).
 * 
 * Created by xubai on 15/10/8.
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] array, int target) {
        if (array == null || array.length < 3) {
            throw new RuntimeException("This array must contain at least 3 elements!");
        }
        int result = 0;
        int minDistance = Integer.MAX_VALUE;
        Arrays.sort(array);
        for (int i = 0 ; i < array.length - 2 ; i++) {
            if (array[i] > result) {
                break;
            }
            if (i > 0 && array[i] == array[i - 1]) {
                continue;
            }
            int start = i + 1;
            int end = array.length - 1;
            while (start < end) {
                int sum = array[i] + array[start] + array[end];
                int distance = target - sum;
                if (distance == 0) {
                    return 0;
                }
                int absDistance = Math.abs(distance);
                if (absDistance < minDistance) {
                    minDistance = absDistance;
                    result = sum;
                }
                while (start < end && array[start] == array[start + 1]) {
                    start++;
                }
                while (start < end && array[end - 1] == array[end]) {
                    end--;
                }
                if (distance > 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return result;
    }
}
