package xubai.leetcode.string;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 输入：haystack = "abcdabc"，needle = "dab"，预期返回：3
 * 
 * Created by xubai on 15/11/4.
 */
public class ImplementStrStrTest {
    private ImplementStrStr o = new ImplementStrStr();
    private String haystack = "abcdabc";
    private String needle = "dab";

    @Test
    public void test() {
        int result;
        result = o.implementStrStr(haystack, needle);
        assertTrue(result == 3);
        result = o.implementStrStr1(haystack, needle);
        assertTrue(result == 3);
    }
}
