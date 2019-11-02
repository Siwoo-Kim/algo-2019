package quiz;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import quiz.chapter1.BasicCounter;
import quiz.chapter1.BinarySearch;
import quiz.chapter1.Counter;
import quiz.chapter1.LoggedBinarySearch;

import java.util.Arrays;

/**
 * Created by sm123tt@gmail.com on 2019-11-02
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class P128 {

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] ints = in.readAllInts();
        Arrays.sort(ints);
        Counter c = new BasicCounter("BinarySearch");
        BinarySearch bs = new LoggedBinarySearch(c);

        while (!StdIn.isEmpty()) {
            int num = StdIn.readInt();
            int index = bs.rank(ints, num);
            System.out.printf("Index = %d, Steps = %d%n", index, c.tally());
            c = new BasicCounter("BinarySearch");
            bs = new LoggedBinarySearch(c);
        }
    }
}
