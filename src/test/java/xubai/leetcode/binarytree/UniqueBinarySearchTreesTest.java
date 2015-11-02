package xubai.leetcode.binarytree;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 输入：n = 3，预期输出为5。
 * 
 * Created by xubai on 15/11/2.
 */
public class UniqueBinarySearchTreesTest {
    private UniqueBinarySearchTrees o = new UniqueBinarySearchTrees();
    private int n = 3;

    @Test
    public void test() {
        int result = o.uniqueBinarySearchTrees(n);
        assertTrue(result == 5);
    }
}
