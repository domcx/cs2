package co.levee.cs2.Homework5

import spock.lang.Specification

/**
 * Created by Dominic Moorman on 10/5/16.
 */
class CalcAreaTest extends Specification {
    def "Circle"() {
        expect:
        ((int)(Math.PI * 100000)) == (int)((CalcArea.Circle(rad) / (double)(rad * rad)) * 100000);

        where:
        rad << (1..1000)
    }

    def "Rectangle"() {
        expect:
        ((double) a) == Math.sqrt(CalcArea.Rectangle(a, a))

        where:
        a << (1..1000)
    }

    def "Triangle"() {
        expect:
        ((double) a) == Math.sqrt(CalcArea.Triangle(a, a) * 2)

        where:
        a << (1..1000)
    }
}
