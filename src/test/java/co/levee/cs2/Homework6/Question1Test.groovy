package co.levee.cs2.Homework6

import co.levee.cs2.Commons
import spock.lang.Specification

/**
 * Created by Dominic Moorman on 10/19/16.
 */
class Question1Test extends Specification {

    def "GetMin"() {
        given:
        def poly = Commons.PolyFill(200)

        expect:
        int res = new Question1(poly).getMin();
        res < 100 && res < 50
    }

    def "GetMax"() {
        given:
        def poly = Commons.PolyFill(200)

        expect:
        int res = new Question1(poly).getMax()
        res > 0 && res > 50
    }

    def "GetAvg"() {
        given:
        def poly = Commons.PolyFill(200)

        expect:
        int res = new Question1(poly).getAvg()
        res > 40 && res < 60
    }
}
