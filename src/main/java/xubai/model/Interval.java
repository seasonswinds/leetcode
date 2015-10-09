package xubai.model;

/**
 * 区间
 * 
 * Created by xubai on 15/10/9.
 */
public class Interval implements Comparable<Interval> {
    private int start;
    private int end;

    public Interval() {
        this.start = 0;
        this.end = 0;
    }

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public int compareTo(Interval o) {
        return start - o.getStart();
    }

    @Override
    public String toString() {
        return "[" + start + ", " + end + "]";
    }
}
