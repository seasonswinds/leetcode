package xubai.leetcode.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import xubai.model.Interval;

/**
 * Given a collection of intervals, merge all overlapping intervals.
 * 
 * For example, Given [1, 3], [2, 6], [8, 10], [15, 18], return [1, 6], [8, 10], [15, 18].
 * 
 * Created by xubai on 15/10/9.
 */
public class MergeIntervals {
    public List<Interval> mergeIntervals(List<Interval> intervals) {
        if (intervals == null || intervals.size() < 2) {
            return intervals;
        }
        List<Interval> result = new ArrayList<Interval>();
        Collections.sort(intervals);
        Interval pre = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval cur = intervals.get(i);
            if (pre.getEnd() > cur.getStart()) {
                if (pre.getEnd() < cur.getEnd()) {
                    pre = new Interval(pre.getStart(), cur.getEnd());
                }
            } else {
                result.add(pre);
                pre = cur;
            }
        }
        result.add(pre);
        return result;
    }
}
