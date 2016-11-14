package co.levee.cs2.Homework6

import co.levee.cs2.Commons
import spock.lang.Specification

/**
 * Created by Dominic Moorman on 10/19/16.
 */
class Question3Test extends Specification {
    def "Append"() {
        given:
        def poly = Commons.PolyFill(100)
        def poly2 = Commons.PolyFill(100)

        and:
        def res = Question3.Append(poly, poly2)

        expect:
        for (int i = 0; i < poly.length; i++)
            poly[i] == res[i]
        for (int i = poly.length - 1; i < poly2.length; i++)
            poly2[i] == res[i]
    }
}
