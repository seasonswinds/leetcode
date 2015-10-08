package xubai.leetcode.sort;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 输入数组{-1, 2, 1, -4}以及target = 1，预期输出为2。
 * 
 * Created by xubai on 15/10/8.
 */
public class ThreeSumClosestTest {
    private ThreeSumClosest o = new ThreeSumClosest();
    private int[] array = {-1, 2, 1, -4};
    private int target = 1;

    @Test
    public void test() {
        int result = o.threeSumClosest(array, target);
        assertTrue(result == 2);
    }
}
