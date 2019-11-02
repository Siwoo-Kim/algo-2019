package quiz.chapter1;

import edu.princeton.cs.algs4.StdDraw;

/**
 * Created by sm123tt@gmail.com on 2019-11-02
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class VisualCounter implements Counter {
    private final String NAME;
    private final int MAX;
    private int v;

    public VisualCounter(String name, int max) {
        this.MAX = max;
        this.NAME = name;
        StdDraw.setPenRadius(.005);
        StdDraw.setXscale(0, 6);
        StdDraw.setYscale(-max-3, max+3);
    }

    @Override
    public void increment() {
        if (MAX != v) {
            v++;
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.point(3, v);
        }
    }

    @Override
    public void decrement() {
        if (v > 0) {
            v--;
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.point(3, v);
        }
    }

    @Override
    public int tally() {
        return v;
    }
}
