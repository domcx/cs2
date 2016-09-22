package co.levee.cs2.Homework3

import spock.lang.Specification

/**
 * Created by Dominic Moorman on 9/21/16.
 */
class LetterGradeTest extends Specification {
    def "Check 95 is A"() {
        given:
        int grade = 95;

        when:
        String g = LetterGrade.work(grade)

        then:
        "A" == g
    }

    def "Check 85 is B"() {
        given:
        int grade = 85;

        when:
        String g = LetterGrade.work(grade)

        then:
        "B" == g
    }

    def "Check 75 is C"() {
        given:
        int grade = 75;

        when:
        String g = LetterGrade.work(grade)

        then:
        "C" == g
    }

    def "Check 65 is D"() {
        given:
        int grade = 65;

        when:
        String g = LetterGrade.work(grade)

        then:
        "D" == g
    }

    def "Check 55 is F"() {
        given:
        int grade = 55;

        when:
        String g = LetterGrade.work(grade)

        then:
        "F" == g
    }
}
