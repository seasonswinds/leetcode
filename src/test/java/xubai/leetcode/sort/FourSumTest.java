package xubai.leetcode.sort;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import xubai.util.CommonUtil;

/**
 * 输入数组：{1, 0, -1, 0, -2, 2}以及target = 0，预期输出为{-1, 0, 0, 1}, {-2, -1, 1, 2}, {-2, 0, 0, 2}
 * 
 * Created by xubai on 15/10/8.
 */
public class FourSumTest {
    private FourSum o = new FourSum();
    private int[] array = {1, 0, -1, 0, -2, 2};
    private int target = 0;

    @Test
    public void test() {
        List<List<Integer>> results = o.fourSum(array, target);
        String str = "";
        for (List<Integer> result : results) {
            str += CommonUtil.listToString(result);
        }
        assertTrue("-2, -1, 1, 2-2, 0, 0, 2-1, 0, 0, 1".equals(str));
    }
}
