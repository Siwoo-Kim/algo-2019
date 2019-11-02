package siwoo.chapter2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by sm123tt@gmail.com on 2019-10-31
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class Interval2DClient {

    public static void main(String[] args) {
        double xlo = Double.parseDouble(args[0]);
        double xhi = Double.parseDouble(args[1]);
        double ylo = Double.parseDouble(args[2]);
        double yhi = Double.parseDouble(args[3]);
        int T = Integer.parseInt(args[4]);

        Interval1D xint = new Interval1D(xlo, xhi);
        Interval1D yint = new Interval1D(ylo, yhi);
        Interval2D box = new Interval2D(xint, yint);
        box.draw();

        Counter c = new Counter("hits");
        for (int i=0; i<T; i++) {
            double x = StdRandom.uniform(0.0, 1.0);
            double y = StdRandom.uniform(0.0, 1.0);
            Point2D p = new Point2D(x, y);
            if (box.contains(p))
                c.increment();
            else
                p.draw();
        }
        System.out.println(c);
        System.out.printf("area = %.2f\n", box.area());
    }
}
