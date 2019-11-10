package siwoo.chapter3;

import edu.princeton.cs.algs4.StdIn;

/**
 * Created by sm123tt@gmail.com on 2019-11-03
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */


public class Stats {

    public static void main(String[] args) {
        Bag<Double> bags = getBag();

        while (!StdIn.isEmpty())
            bags.add(StdIn.readDouble());
        final int N = bags.size();

        double sum = 0.0;
        for (double el: bags)
            sum += el;
        double avg = sum / N;

        sum = 0.0;
        for (double el: bags)
            sum += (el-avg) * (el-avg);
        double stddev = Math.sqrt(sum / (N-1));

        System.out.printf("Average = %.2f%n" +
                "Standard deviation = %.2f%n", avg, stddev);
    }

    private static Bag<Double> getBag() {
        return null;
    }
}
