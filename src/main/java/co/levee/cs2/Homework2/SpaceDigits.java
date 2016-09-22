package co.levee.cs2.Homework2;

import java.util.Scanner;

/**
 * Created by Dominic Moorman on 9/6/16.
 * <p>
 * Application will take a 5 digit integer and split it by each number.
 * EX. In: 12345 Out: 1 2 3 4 5
 */
public class SpaceDigits {
    /**
     * Splits up the integers
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        System.out.printf("Enter five digit number: ");
        int i = new Scanner(System.in).nextInt();
        System.out.printf("The integer is %s\n", isEven(i) ? "even" : "odd");
        System.out.println(split(i));
    }

    /**
     * Given an integer split it up into a string.
     *
     * Extrapolated for testing purposes.
     *
     * @param i Given integer.
     * @return Integer split into a string.
     */
    public static String split(int i) {
        return String.join(" ", Integer.toString(i).split(""));
    }

    /**
     * Check if integer is even or odd.
     *
     * Extrapolated for testing purposes.
     *
     * @param i The integer.
     * @return Bool whether even or odd.
     */
    public static boolean isEven(int i) {
        return i % 2 == 0;
    }
}
