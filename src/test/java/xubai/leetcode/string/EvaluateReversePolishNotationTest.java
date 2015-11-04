package xubai.leetcode.string;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 输入：{"2", "1", "+", "3", "*"}，预期输出为：9
 *
 * 输入：{"4", "13", "5", "/", "+"}，预期输出为：6
 * 
 * Created by xubai on 15/11/4.
 */
public class EvaluateReversePolishNotationTest {
    private EvaluateReversePolishNotation o = new EvaluateReversePolishNotation();
    private String[] tokens1 = {"2", "1", "+", "3", "*"};
    private String[] tokens2 = {"4", "13", "5", "/", "+"};

    @Test
    public void test() {
        int result;
        result = o.evaluateReversePolishNotation(tokens1);
        assertTrue(result == 9);
        result = o.evaluateReversePolishNotation(tokens2);
        assertTrue(result == 6);
    }
}
