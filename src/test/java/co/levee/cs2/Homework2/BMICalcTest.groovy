package co.levee.cs2.Homework2

import spock.lang.Specification

/**
 * Created by Dominic Moorman on 9/14/16.
 */
class BMICalcTest extends Specification {

    def "Test BMI when height is 72 and weight is 150"() {
        given:
        def height = 72
        def weight = 150

        when:
        def BMI = (float)BMICalc.calc(weight, height)
        System.out.printf("Height is %sin and weight is %slb\n", height, weight)

        then:
        BMI == (float)((Math.abs(weight) * BMICalc.BMI_CONST) / Math.abs(height))

        System.out.printf("BMI is %s\n", (BMI > 0 ? "positive" : "negative."))
    }

    def "Test when Height or Weight is given as a negative int"() {
        given:
        def height = -80
        def weight = 180

        System.out.printf("Height is %sin and weight is %slb\n", height, weight)

        when:
        def BMI = (float)BMICalc.calc(weight, height)

        System.out.printf("BMI is %f\n", BMI)

        then:
        BMI == (float)((Math.abs(weight) * BMICalc.BMI_CONST) / Math.abs(height))
        BMI > 0

        System.out.printf("BMI is %s\n", (BMI > 0 ? "positive" : "negative."))
    }
}
