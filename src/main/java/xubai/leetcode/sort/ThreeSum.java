package xubai.leetcode.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all
 * unique triplets in the array which gives the sum of zero.
 * 
 * • Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
 * • The solution set must not contain duplicate triplets.
 * 
 * For example, given array S = {-1, 0, 1, 2, -1, -4}, A solution set is: (-1, 0, 1) (-1, -1, 2)
 * 
 * Created by xubai on 15/10/8.
 */
public class ThreeSum {
    /**
     * 1. a + b + c = 0 <=> b + c = -a，可以减少内循环中的计算。
     * 2. 用一前一后2个指针来遍历有序数组，2个指针对应的数值之和大于预期则后指针前移，反之，前指针后移。可以减少一次遍历。
     * 
     * @param array
     * @return
     */
    public List<List<Integer>> threeSum(int[] array) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        if (array == null || array.length < 3) {
            return results;
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] > 0) {
                break;
            }
            if (i > 0 && array[i] == array[i - 1]) {
                continue;
            }
            int start = i + 1;
            int end = array.length - 1;
            int negtive = -array[i];
            while (start < end) {
                int sum = array[start] + array[end];
                if (sum == negtive) {
                    List<Integer> result = new ArrayList<Integer>(3);
                    result.add(array[i]);
                    result.add(array[start]);
                    result.add(array[end]);
                    results.add(result);
                    while (start < end && array[start] == array[start + 1]) {
                        start++;
                    }
                    while (start < end && array[end - 1] == array[end]) {
                        end--;
                    }
                    start++;
                    end--;
                } else if (sum < negtive) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return results;
    }
}
