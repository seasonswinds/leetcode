package xubai.leetcode.sort;

import org.junit.Test;
import xubai.util.CommonUtil;

import static org.junit.Assert.assertTrue;

/**
 * 输入：{2, 0, 2, 1, 0, 1, 0}，预期输出为：{0, 0, 0, 1, 1, 2, 2}
 * 
 * Created by xubai on 15/10/9.
 */
public class SortColorsTest {
    private SortColors o = new SortColors();
    private int[] array = {2, 0, 2, 1, 0, 1, 0};

    @Test
    public void test() {
        o.sortColors(array);
        assertTrue("0, 0, 0, 1, 1, 2, 2".equals(CommonUtil.arrayToString(array)));
    }
}
