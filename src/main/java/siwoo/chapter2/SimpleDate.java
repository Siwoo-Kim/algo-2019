package siwoo.chapter2;

/**
 * Created by sm123tt@gmail.com on 2019-11-02
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class SimpleDate implements Date {
    private final int year;
    private final int month;
    private final int day;

    public static SimpleDate of(int year, int month, int day) {
        return new SimpleDate(year, month, day);
    }

    SimpleDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public int month() {
        return month;
    }

    @Override
    public int day() {
        return day;
    }

    @Override
    public int year() {
        return year;
    }

    @Override
    public String toString() {
        return year() + "/" + month() + "/" + day();
    }
}
