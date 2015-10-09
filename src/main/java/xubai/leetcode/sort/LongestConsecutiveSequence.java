package xubai.leetcode.sort;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements
 * sequence. For example, Given [100, 4, 200, 1, 3, 2], The longest consecutive elements sequence is
 * [1, 2, 3, 4]. Return its length: 4. Your algorithm should run in O(n) complexity.
 * 
 * Created by xubai on 15/10/9.
 */
public class LongestConsecutiveSequence {
    public int longestConsecutiveSequence(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int length = 1;
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>(array.length);
        for (int value : array) {
            map.put(value, Boolean.TRUE);
        }
        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            if (entry.getValue()) {
                int value = entry.getKey();
                int left = value - 1;
                int right = value + 1;
                int count = 1;
                while (map.containsKey(left) && map.get(left)) {
                    count++;
                    map.put(left, Boolean.FALSE);
                    left--;
                }
                while (map.containsKey(right) && map.get(right)) {
                    count++;
                    map.put(right, Boolean.FALSE);
                    right++;
                }
                length = Math.max(length, count);
            }
        }
        return length;
    }
}
