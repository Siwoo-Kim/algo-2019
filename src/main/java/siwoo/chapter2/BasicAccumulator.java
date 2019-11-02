package siwoo.chapter2;

/**
 * Created by sm123tt@gmail.com on 2019-11-02
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class BasicAccumulator implements Accumulator {
    private double total;
    private int N;

    @Override
    public void addData(double value) {
        N++;
        total += value;
    }

    @Override
    public double average() {
        return total / N;
    }

    @Override
    public String toString() {
        return "Average (" + N + " values): "
                + String.format("%7.5f", average());
    }
}
