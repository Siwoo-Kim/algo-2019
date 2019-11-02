package siwoo.chapter2;

import edu.princeton.cs.algs4.StdDraw;

public class VisualAccumulator implements Accumulator {
    private double total;
    private int N;

    public VisualAccumulator(int trials, double max) {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(.005);
    }

    @Override
    public void addData(double value) {
        N++;
        total += value;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N, value);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N, average());
    }

    @Override
    public double average() {
        return total / N;
    }
}
