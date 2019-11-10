package siwoo.chapter3;

import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

/**
 * Created by sm123tt@gmail.com on 2019-11-03
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class TestQueue1 {

    public static void main(String[] args) {
        Queue<Integer> queue = getQueue();
        while (!StdIn.isEmpty())
            queue.enqueue(StdIn.readInt());
        final int N = queue.size();

        int[] array = new int[N];
        for (int i=0; i<N; i++)
            array[i] = queue.dequeue();
        System.out.println(Arrays.toString(array));
    }

    private static Queue<Integer> getQueue() {
        return null;
    }
}
