package xubai.leetcode.string;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 输入："Hello World"，预期输出：5
 *
 * Created by xubai on 15/11/5.
 */
public class LengthOfLastWordTest {
    private LengthOfLastWord o = new LengthOfLastWord();
    private String s = "Hello World";

    @Test
    public void test() {
        int result = o.lengthOfLastWord(s);
        assertTrue(result == 5);
    }
}
