package siwoo.chapter2;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by sm123tt@gmail.com on 2019-11-02
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class TestAccumulator {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Accumulator accumulator = new VisualAccumulator(N, 1.0);
        for (int i=0; i<N; i++)
            accumulator.addData(StdRandom.random());
        System.out.println(accumulator);
    }

}
