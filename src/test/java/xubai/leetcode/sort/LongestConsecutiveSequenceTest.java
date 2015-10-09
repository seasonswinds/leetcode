package xubai.leetcode.sort;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 输入数组：{100, 4, 200, 1, 3, 2}，预期输出为4
 * 
 * Created by xubai on 15/10/9.
 */
public class LongestConsecutiveSequenceTest {
    private LongestConsecutiveSequence o = new LongestConsecutiveSequence();
    private int[] array = {100, 4, 200, 1, 3, 2};

    @Test
    public void test() {
        int length = o.longestConsecutiveSequence(array);
        assertTrue(length == 4);
    }
}
