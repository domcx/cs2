package co.levee.cs2.Homework2

import spock.lang.Specification

/**
 * Created by Dominic Moorman on 9/8/16.
 */
class SpaceDigitsTest extends Specification {

    def "See what happens when i is 123"() {

        given: "when i is 123"
        def i = 123

        when: "even is equal to iseven"
        def even = SpaceDigits.isEven(i)

        then: "Value 123 should be odd"
        !even

        when:
        def split = SpaceDigits.split(i)

        then: "Value should be '1 2 3'"
        split == "1 2 3"

        System.out.println(split)
    }

    def "See what happens when i is 124"() {
        given:
        def i = 124

        when:
        def even = SpaceDigits.isEven(i)

        then:
        even

        when:
        def split = SpaceDigits.split(i)

        then:
        split == "1 2 4"

        System.out.println(split)
    }

    def "See what happens when i is 12345"() {
        given:
        def i = 12345

        when:
        def even = SpaceDigits.isEven(i)

        then:
        !even

        when:
        def split = SpaceDigits.split(i)

        then:
        split == "1 2 3 4 5"

        System.out.println(split)
    }

    def "See what happens when i is 123456"() {
        given:
        def i = 123456

        when:
        def even = SpaceDigits.isEven(i)

        then:
        even

        when:
        def split = SpaceDigits.split(i)

        then:
        split == "1 2 3 4 5 6"

        System.out.println(split)
    }
}
