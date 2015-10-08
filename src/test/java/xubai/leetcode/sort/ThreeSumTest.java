package xubai.leetcode.sort;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import xubai.util.CommonUtil;

/**
 * 输入数组{-1, 0, 1, 2, -1, -4}，预期输出为{-1, 0, 1}, {-1, -1, 2}
 *
 * Created by xubai on 15/10/8.
 */
public class ThreeSumTest {
    private ThreeSum o = new ThreeSum();
    private int[] array = {-1, 0, 1, 2, -1, -4};

    @Test
    public void test() {
        List<List<Integer>> results = o.threeSum(array);
        String str = "";
        for (List<Integer> result : results) {
            str += CommonUtil.listToString(result);
        }
        assertTrue("-1, -1, 2-1, 0, 1".equals(str));
    }
}
