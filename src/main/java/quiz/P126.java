package quiz;

import edu.princeton.cs.algs4.StdIn;

/**
 * Created by sm123tt@gmail.com on 2019-11-02
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class P126 {

    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            String[] s = StdIn.readLine().split("\\s");
            if (circularEqual(s[0], s[1]))
                System.out.printf("Circular equal: %s, %s%n", s[0], s[1]);
            else
                System.out.printf("Circular not equal: %s, %s%n", s[0], s[1]);
        }
    }

    static boolean circularEqual(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
//        if (s1.equals(s2)) return true;
//        for (int i=0; i<s1.length(); i++) {
//            s1 = s1.substring(1) + s1.substring(0, 1);
//            if (s1.equals(s2))
//                return true;
//        }
//        return false;
    }
}
