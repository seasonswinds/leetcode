package xubai.leetcode.string;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 输入：n = 5，预期输出为："111221"
 * 
 * Created by xubai on 15/11/4.
 */
public class CountandSayTest {
    private CountandSay o = new CountandSay();
    private int n = 5;

    @Test
    public void test() {
        String result = o.countandSay(n);
        assertTrue("111221".equals(result));
    }
}
