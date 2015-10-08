package xubai.leetcode.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d =
 * target? Find all unique quadruplets in the array which gives the sum of target.
 * 
 * Note: Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d) The
 * solution set must not contain duplicate quadruplets.
 * 
 * For example, given array S = {1, 0, -1, 0, -2, 2}, and target = 0.
 * 
 * A solution set is: (-1, 0, 0, 1) (-2, -1, 1, 2) (-2, 0, 0, 2)
 * 
 * Created by xubai on 15/10/8.
 */
public class FourSum {
    /**
     * 借用3Sum的思路
     *
     * @param array
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] array, int target) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        if (array == null || array.length < 4) {
            return results;
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length - 3; i++) {
            if (array[i] > target) {
                break;
            }
            if (i > 0 && array[i] == array[i - 1]) {
                continue;
            }
            List<List<Integer>> threeSumResults = threeSum(array, i + 1, target - array[i]);
            for (List<Integer> result : threeSumResults) {
                result.set(0, array[i]);
                results.add(result);
            }
        }
        return results;
    }

    private List<List<Integer>> threeSum(int[] array, int initIndex, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = initIndex; i < array.length - 2; i++) {
            if (array[i] >= target) {
                break;
            }
            if (i > initIndex && array[i] == array[i - 1]) {
                continue;
            }
            int start = i + 1;
            int end = array.length - 1;
            while (start < end) {
                int sum = array[i] + array[start] + array[end];
                if (sum == target) {
                    List<Integer> solution = new ArrayList<Integer>(4);
                    solution.add(0);
                    solution.add(array[i]);
                    solution.add(array[start]);
                    solution.add(array[end]);
                    result.add(solution);
                    while (start < end && array[start] == array[start + 1]) {
                        start++;
                    }
                    while (start < end && array[end] == array[end - 1]) {
                        end--;
                    }
                    start++;
                    end--;
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return result;
    }
}
