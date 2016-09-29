package co.levee.cs2.Homework4

import spock.lang.Specification

/**
 * Created by Dominic Moorman on 9/27/16.
 */
class DaysInMonthTest extends Specification {
    def "Ensure leap year check is working"() {
        given:
        def dim = new DaysInMonth(2016)
        def dim2 = new DaysInMonth(2020)
        def dim3 = new DaysInMonth(2015)

        expect:
        dim.leapYear
        dim2.leapYear
        !dim3.leapYear
    }

    def "Month iteration is working"() {
        given:
        def dim = new DaysInMonth(2000)

        expect:
        int last = dim.next()
        dim.getMonthNum() == Calendar.FEBRUARY
        last != dim.next()
        dim.getMonthNum() == Calendar.MARCH
    }
}
