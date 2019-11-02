package quiz.chapter1;

import siwoo.chapter2.Date;

import java.time.LocalDate;

/**
 * Created by sm123tt@gmail.com on 2019-11-02
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class SmartDate implements Date {
    private int v;

    public SmartDate(int year, int month, int day) {
        this.v = (512 * year) + (month * 32) + day;
    }

    @Override
    public int month() {
        return v / 32 % 16;
    }

    @Override
    public int day() {
        return v % 16;
    }

    @Override
    public int year() {
        return v / 512;
    }

    private String dayOfTheWeek() {
        LocalDate date = LocalDate.of(year(), month(), day());
        return date.getDayOfWeek().toString();
    }

    @Override
    public String toString() {
        return year() + "/" + month() + "/" + day() + " " + dayOfTheWeek();
}
}
