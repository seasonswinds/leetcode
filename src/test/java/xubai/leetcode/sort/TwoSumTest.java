package xubai.leetcode.sort;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 
 * 输入数组：{2, 7, 11, 15}以及target = 9，预期输出为index1 = 1, index2 = 2
 * 
 * Created by xubai on 15/10/9.
 */
public class TwoSumTest {
    private TwoSum o = new TwoSum();
    private int[] array = {2, 7, 11, 15};
    private int target = 9;

    @Test
    public void test() {
        TwoSum.Answer answer = o.twoSum(array, target);
        assertTrue(answer.getIndex1() == 1);
        assertTrue(answer.getIndex2() == 2);
    }
}
