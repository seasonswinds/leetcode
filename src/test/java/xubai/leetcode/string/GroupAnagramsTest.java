package xubai.leetcode.string;

import org.junit.Before;
import org.junit.Test;
import xubai.util.CommonUtil;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * 输入：{"eat", "tea", "tan", "ate", "nat", "bat"}
 * 
 * 预期输出：{{"ate", "eat", "tea"}, {"nat", "tan"}, {"bat"}}
 * 
 * Created by xubai on 15/11/3.
 */
public class GroupAnagramsTest {
    private GroupAnagrams o = new GroupAnagrams();
    private List<String> stringList;

    @Before
    public void setUp() {
        stringList = new ArrayList<String>(6);
        stringList.add("eat");
        stringList.add("tea");
        stringList.add("tan");
        stringList.add("ate");
        stringList.add("nat");
        stringList.add("bat");
    }

    @Test
    public void test() {
        List<List<String>> result = o.groupAnagrams(stringList);
        assertTrue("{eat, tea, ate}, {bat}, {tan, nat}".equals(CommonUtil.listToString(result)));
    }
}
