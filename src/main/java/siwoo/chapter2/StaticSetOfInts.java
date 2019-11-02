package siwoo.chapter2;

import java.util.Arrays;

/**
 * Created by sm123tt@gmail.com on 2019-11-02
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class StaticSetOfInts {

    private int[] a;

    /**
     * Create set by a[]
     * @param array
     */
    public StaticSetOfInts(int[] array) {
        this.a = new int[array.length];
        System.arraycopy(array, 0, this.a, 0, array.length); //Defensive copy
        Arrays.sort(this.a);
    }


    /**
     * Returns <tt>true</tt> if this set contains the key
     *
     * @param key
     * @return true if key exists in set,
     * otherwise return false.
     */
    boolean contains(int key) {
        return rank(key) != -1;
    }

    public int rank(int key) {
        int low = 0, high = a.length-1;
        while (low <= high) {
            int mid = low + high;
            if (a[mid] < key)
                low = mid + 1;
            else if (a[mid] > key)
                high = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
