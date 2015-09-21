package xubai.leetcode.list;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * 新建LRUCache，capacity为4，并用1，2，3，4初始化，并执行get(1)，set(5)。预期get(1)返回1，get(2)返回-1.
 *
 * Created by xubai on 15/9/21.
 */
public class LRUCacheTest {
    private LRUCache o = new LRUCache(4);

    @Before
    public void setUp() {
        o.set(1, 1);
        o.set(2, 2);
        o.set(3, 3);
        o.set(4, 4);
    }

    @Test
    public void test() {
        o.get(1);
        o.set(5, 5);
        assertTrue(o.get(1) == 1);
        assertTrue(o.get(2) == -1);
    }
}
