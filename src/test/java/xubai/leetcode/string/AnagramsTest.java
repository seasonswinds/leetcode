package xubai.leetcode.string;

import org.junit.Before;
import org.junit.Test;
import xubai.util.CommonUtil;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * 输入：{"tea","and","ate","eat","den"}
 *
 * 预期输出：{"tea","ate","eat"}
 *
 * Created by xubai on 15/11/3.
 */
public class AnagramsTest {
    private Anagrams o = new Anagrams();
    private List<String> stringList;

    @Before
    public void setUp() {
        stringList = new ArrayList<String>(5);
        stringList.add("tea");
        stringList.add("and");
        stringList.add("ate");
        stringList.add("eat");
        stringList.add("den");
    }

    @Test
    public void test() {
        List<String> result = o.anagrams(stringList);
        assertTrue("tea, ate, eat".equals(CommonUtil.listToString(result)));
    }
}
