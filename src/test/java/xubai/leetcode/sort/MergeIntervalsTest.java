package xubai.leetcode.sort;

import org.junit.Before;
import org.junit.Test;
import xubai.model.Interval;
import xubai.util.CommonUtil;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * 输入：[1, 3], [2, 6], [8, 10], [15, 18]，预期输出为：[1, 6], [8, 10], [15, 18]
 *
 * Created by xubai on 15/10/9.
 */
public class MergeIntervalsTest {
    private MergeIntervals o = new MergeIntervals();
    private List<Interval> intervals;

    @Before
    public void setUp() {
        intervals = new ArrayList<Interval>(4);
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));
    }

    @Test
    public void test() {
        List<Interval> result = o.mergeIntervals(intervals);
        assertTrue("[1, 6], [8, 10], [15, 18]".equals(CommonUtil.listToString(result)));
    }
}
