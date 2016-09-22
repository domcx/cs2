package co.levee.cs2.Homework2;

import java.util.Scanner;

/**
 * Created by Dominic Moorman on 9/6/16.
 *
 * Will Calculate the circumference based on given values.
 */
public class CalcCircumference {
    /**
     * Will take input for the radius and print the Diameter, Area and Circumference
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        System.out.printf("Enter radius: ");
        int rad = Math.abs(new Scanner(System.in).nextInt());
        System.out.printf("Diameter is %s\nArea is %f\nCircumference is %f\n", diameter(rad), area(rad), circumference(rad));
    }

    /**
     * Calculates the diamater given a radius.
     *
     * Extrapolated for testing purposes.
     *
     * @param rad Radius of the circle
     * @return Diameter of the circle.
     */
    public static int diameter(int rad) {
        return 2 * rad;
    }

    /**
     * Returns the area of a circle given a radius.
     *
     * Extrapolated for testing purposes.
     *
     * @param rad Radius of the circle.
     * @return The area of the circle.
     */
    public static double area(int rad) {
        return 2 * Math.PI * rad;
    }

    /**
     * The Circumference of a circle given a radius.
     *
     * Extrapolated for testing purposes.
     *
     * @param rad Raidus of the circle.
     * @return Circumference of the circle.
     */
    public static double circumference(int rad) {
        return Math.PI * Math.pow(rad, 2);
    }
}
