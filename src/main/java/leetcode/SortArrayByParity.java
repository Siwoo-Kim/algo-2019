package leetcode;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by sm123tt@gmail.com on 2019-11-09
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class SortArrayByParity {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1,0};
        solution.moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }

    static class Solution {
        public void moveZeroes(int[] a) {
            final int N = a.length;
            for (int start=0, end=0; end<N; end++) {
                if (a[end] != 0) {
                    int t = a[end];
                    a[end] = a[start];
                    a[start++] = t;
                }
            }
        }
    }
}
