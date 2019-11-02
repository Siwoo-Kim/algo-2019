package quiz;

import edu.princeton.cs.algs4.*;

import java.util.*;

/**
 * Created by sm123tt@gmail.com on 2019-11-02
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class P122 {

    public static void main(String[] args) {
        int N = 3; //Integer.parseInt(3);
        Interval1D[] lines = getInterval(N);
        Interval1D[] intersectedLines = getIntersections(lines);
        for (int i=0; i<lines.length; i++) {
            System.out.printf("Line (%.2f, %.2f)\n",
                    lines[i].min(),
                    lines[i].max());
        }
        System.out.println("Intersected");
        for (int i=0; i<intersectedLines.length; i++) {
            System.out.printf("Line (%.2f, %.2f)\n",
                    intersectedLines[i].min(),
                    intersectedLines[i].max());
        }
    }

    private static Interval1D[] getIntersections(Interval1D[] lines) {
        Set<Interval1D> result = new HashSet<>();
        for (int i=0; i<lines.length-1; i++) {
            for (int j=i+1; j<lines.length; j++) {
                if (lines[i].intersects(lines[j])) {
                    result.add(lines[i]);
                    result.add(lines[j]);
                }
            }
        }
        return result.toArray(new Interval1D[0]);
    }

    private static Interval1D[] getInterval(final int N) {
        Interval1D[] a = new Interval1D[N];
        for (int i=0; i<N; i++) {
            double x = StdRandom.uniform();
            double y = StdRandom.uniform();
            if (Double.compare(x, y) > 0) {
                double t = x;
                x = y;
                y = t;
            }
            a[i] = new Interval1D(x, y);
        }
        return a;
    }
}
