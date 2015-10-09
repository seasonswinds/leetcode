package xubai.leetcode.sort;

import org.junit.Before;
import org.junit.Test;
import xubai.model.Interval;
import xubai.util.CommonUtil;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * 输入：[1, 3], [6, 9]，并插入[2, 5]，预期输出为：[1, 5], [6, 9]
 * 
 * 输入：[1, 2], [3, 5], [6, 7], [8, 10], [12, 16]，并插入[4, 9]，预期输出为：[1, 2], [3, 10], [12, 16]
 * 
 * Created by xubai on 15/10/9.
 */
public class InsertIntervalTest {
    private InsertInterval o = new InsertInterval();
    private List<Interval> intervals1;
    private Interval newIntervals1;
    private List<Interval> intervals2;
    private Interval newIntervals2;

    @Before
    public void setUp() {
        intervals1 = new ArrayList<Interval>(2);
        intervals1.add(new Interval(1, 3));
        intervals1.add(new Interval(6, 9));
        newIntervals1 = new Interval(2, 5);
        intervals2 = new ArrayList<Interval>(5);
        intervals2.add(new Interval(1, 2));
        intervals2.add(new Interval(3, 5));
        intervals2.add(new Interval(6, 7));
        intervals2.add(new Interval(8, 10));
        intervals2.add(new Interval(12, 16));
        newIntervals2 = new Interval(4, 9);
    }

    @Test
    public void test() {
        List<Interval> result1 = o.insertInterval(intervals1, newIntervals1);
        assertTrue("[1, 5], [6, 9]".equals(CommonUtil.listToString(result1)));
        List<Interval> result2 = o.insertInterval(intervals2, newIntervals2);
        assertTrue("[1, 2], [3, 10], [12, 16]".equals(CommonUtil.listToString(result2)));
    }
}
