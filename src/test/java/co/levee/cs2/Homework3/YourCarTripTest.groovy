package co.levee.cs2.Homework3

import spock.lang.Specification

/**
 * Created by Dominic Moorman on 9/21/16.
 */
class YourCarTripTest extends Specification {
    def "Drive miles 1-1000 at 60mph"() {
        given:
        YourCarTrip yct = new YourCarTrip()

        and:
        yct.drive(miles, 60)

        expect:
        yct.minutes > 0
        yct.distance == miles

        where:
        miles << (1..1000)
    }
}
