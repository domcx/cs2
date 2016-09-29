package co.levee.cs2.Homework4;

import java.util.Calendar;

/**
 * Created by Dominic Moorman on 9/27/16.
 */
public class DaysInMonth {
    private Calendar Cal;
    private int iteration;

    public DaysInMonth(int year) {
        this.Cal = Calendar.getInstance();
        Cal.set(Calendar.YEAR, year);
    }

    public int next() {
        int buff = Cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        Cal.set(Calendar.MONTH, ++iteration);
        return buff;
    }

    public boolean isLeapYear() {
        return Cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }

    public int getMonthNum() {
        return iteration;
    }

    public String month() {
        switch (iteration) {
            case Calendar.JANUARY:
                return "January";
            case Calendar.FEBRUARY:
                return "February";
            case Calendar.MARCH:
                return "March";
            case Calendar.APRIL:
                return "April";
            case Calendar.MAY:
                return "May";
            case Calendar.JUNE:
                return "June";
            case Calendar.JULY:
                return "July";
            case Calendar.AUGUST:
                return "August";
            case Calendar.SEPTEMBER:
                return "September";
            case Calendar.OCTOBER:
                return "October";
            case Calendar.NOVEMBER:
                return "November";
            case Calendar.DECEMBER:
                return "December";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        eval(new DaysInMonth(2000));
    }

    public static void eval(DaysInMonth dim) {
        for (int i = 0; i < 12; i++) {
            System.out.printf("%s has %s days.\n", dim.month(), dim.next());
        }
    }
}
