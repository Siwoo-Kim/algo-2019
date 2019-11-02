package siwoo.chapter2;

/**
 * Created by sm123tt@gmail.com on 2019-11-02
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class TestDate {

    public static void main(String[] args) {
        int y = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int d = Integer.parseInt(args[2]);
        Date date = OptimizedDate.of(y, m, d);
        System.out.println(date);
    }
}
