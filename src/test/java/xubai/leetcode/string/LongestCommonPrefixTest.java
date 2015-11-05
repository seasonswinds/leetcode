package xubai.leetcode.string;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 输入：{"abcdabce", "abcdefg", "abd"}，预期输出："ab"
 *
 * Created by xubai on 15/11/5.
 */
public class LongestCommonPrefixTest {
    private LongestCommonPrefix o = new LongestCommonPrefix();
    private String[] strings = {"abcdabce", "abcdefg", "abd"};

    @Test
    public void test() {
        String result = o.longestCommonPrefix(strings);
        assertTrue("ab".equals(result));
    }
}
