package siwoo.chapter1;


import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] a, int low, int high, int t) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (a[mid] < t)
            return binarySearch(a, low, mid-1, t);
        else if (a[mid] > t)
            return binarySearch(a, mid+1, high, t);
        else
            return mid;
    }
//    public static int binarySearch(int[] a, int t) {
//        int low=0, high=a.length-1;
//        while (low <= high) {
//            int mid = (high + low) / 2;
//            if (a[mid] > t)
//                high = mid - 1;
//            else if (a[mid] < t)
//                low = mid + 1;
//            else
//                return mid;
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();

        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (binarySearch(whitelist, 0, whitelist.length-1, key) == -1)
                System.out.println(key);
        }
    }
}
