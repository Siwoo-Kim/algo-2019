package siwoo.chapter4;

import java.util.Arrays;

/**
 * Created by sm123tt@gmail.com on 2019-11-10
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class HeapSort {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i=N/2; i>=1; i--)
            sink(a, i, N);
        while (N > 1) {
            swap(a, 1, N--);
            sink(a, 1, N);
        }
    }

    private static void sink(Comparable[] a, int k, int N) {
        while ((k << 1) <= N) {
            int child = k << 1;
            if (child < N && less(a, child, child+1))
                child++;
            if (!less(a, k, child))
                return;
            swap(a, k, child);
            k = child;
        }
    }

    private static void swap(Comparable[] a, int i, int j) {
        if (i == j) return;
        Comparable e = a[i-1];
        a[i-1] = a[j-1];
        a[j-1] = e;
    }

    private static boolean less(Comparable[] a, int i, int j) {
        return a[i-1].compareTo(a[j-1]) < 0;
    }

    public static void main(String[] args) {
        Integer[] a = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
