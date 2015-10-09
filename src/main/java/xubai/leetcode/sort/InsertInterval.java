package xubai.leetcode.sort;

import xubai.model.Interval;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a set of non-overlapping & sorted intervals, insert a new interval into the intervals
 * (merge if necessary).
 *
 * Example 1: Given intervals [1, 3], [6, 9], insert and merge [2, 5] in as [1, 5], [6, 9].
 * 
 * Example 2: Given [1, 2], [3, 5], [6, 7], [8, 10], [12, 16], insert and merge [4, 9] in as [1, 2],
 * [3, 10], [12, 16].
 * 
 * This is because the new interval [4, 9] overlaps with [3, 5], [6, 7], [8, 10].
 * 
 * Created by xubai on 15/10/9.
 */
public class InsertInterval {
    public List<Interval> insertInterval(List<Interval> intervals, Interval newInterval) {
        if (newInterval == null) {
            return intervals;
        }
        List<Interval> result = new ArrayList<Interval>();
        if (intervals == null || intervals.size() == 0) {
            result.add(newInterval);
            return result;
        }
        for (Interval interval : intervals) {
            if (interval.getEnd() < newInterval.getStart()) {
                result.add(interval);
            } else if (interval.getStart() > newInterval.getEnd()) {
                result.add(newInterval);
                newInterval = interval;
            } else {
                newInterval = new Interval(Math.min(interval.getStart(), newInterval.getStart()), Math.max(interval.getEnd(), newInterval.getEnd()));
            }
        }
        result.add(newInterval);
        return result;
    }
}
