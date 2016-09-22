package co.levee.cs2.Homework2

import spock.lang.Specification

/**
 * Created by Dominic Moorman on 9/13/16.
 */
class CalcCircumferenceTest extends Specification {
    def "Test Diameter is correct given radius of 6"() {
        given:
        def rad = 6

        when:
        def diam = CalcCircumference.diameter(rad)

        then:
        ((int)(rad * 2)) == diam
    }

    def "Test area is correct given radius of 8"() {
        given:
        def rad = 8

        when:
        def area = CalcCircumference.area(rad)

        then:
        area == (double)(Math.PI * 2 * rad)
    }

    def "Test circumference is correct for given radius of 10"() {
        given:
        def rad = 10

        when:
        def area = CalcCircumference.circumference(rad)

        then:
        area == (double)(Math.PI * Math.pow(rad, 2))
    }
}
