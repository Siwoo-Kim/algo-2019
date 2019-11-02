package quiz;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Random;

/**
 * Created by sm123tt@gmail.com on 2019-11-02
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class P121 {

    public static void main(String[] args) {
        final int N = Integer.parseInt(args[args.length-1]);
        StdDraw.setXscale();
        StdDraw.setYscale();

        for (int i=0; i<N; i++)
            StdDraw.point(StdRandom.uniform(), StdRandom.uniform());
    }
}
