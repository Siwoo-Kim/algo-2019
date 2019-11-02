package siwoo.chapter2;

/**
 * Created by sm123tt@gmail.com on 2019-11-02
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class OptimizedDate implements Date {

    private final int value;

    public static Date of(int year, int month, int day) {
        return new OptimizedDate(year * 512 + month * 32 + day);
    }

    OptimizedDate(int value) {
        this.value = value;
    }

    @Override
    public int month() {
        return (value / 32) % 16;
    }

    @Override
    public int day() {
        return value % 32;
    }

    @Override
    public int year() {
        return value / 512;
    }

    @Override
    public String toString() {
        return year() + "/" + month() + "/" + day();
    }
}
