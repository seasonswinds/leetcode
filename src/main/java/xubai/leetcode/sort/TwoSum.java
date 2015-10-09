package xubai.leetcode.sort;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and
 * index2) are not zero-based. You may assume that each input would have exactly one solution.
 * 
 * Created by xubai on 15/10/9.
 */
public class TwoSum {
    public Answer twoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                int index = map.get(array[i]);
                return new Answer(index + 1, i + 1);
            } else {
                map.put(target - array[i], i);
            }
        }
        return new Answer(0, 0);
    }

    public class Answer {
        private int index1;
        private int index2;

        public Answer(int index1, int index2) {
            if (index1 > index2) {
                new Answer(index2, index1);
            } else {
                this.index1 = index1;
                this.index2 = index2;
            }
        }

        public int getIndex1() {
            return index1;
        }

        public int getIndex2() {
            return index2;
        }
    }
}
