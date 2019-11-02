package siwoo.chapter2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

/**
 * Created by sm123tt@gmail.com on 2019-11-02
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class WhiteList {

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] a = in.readAllInts();
        StaticSetOfInts set = new StaticSetOfInts(a);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (!set.contains(key))
                System.out.println(key);
        }
    }
}
