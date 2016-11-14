package co.levee.cs2.Homework2;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Dominic Moorman on 9/6/16.
 * Accepts input from the user via the console and then calculate the users BMI.
 * BMI = (weight lb * 703) / (height in)
 */
public class BMICalc {
    /**
     * BMI constant value of multiplication
     */
    public static final float BMI_CONST = 703;
    /**
     * BMI standards so the user can digest what their BMI means.
     */
    private static final String BMI_STANDARD = "\nBMI Standards:\n" +
            "Underweight: less than 18.5\n" +
            "Normal: between 18.5 and 24.9\n" +
            "Overweight: between 25 and 29.9\n" +
            "Obese: 30 or greater";

    /**
     * Accepts weight, and height from the user and calculates the BMI based on that input.
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        int weight = Integer.valueOf(JOptionPane.showInputDialog(null, "Please input your weight in pounds (lb)"));
        int height = Integer.valueOf(JOptionPane.showInputDialog(null, "Please input your height in inches (in)"));
        System.out.printf("Your weight is %s pounds and your height is %s inches.\n", weight, height);
        System.out.printf("Your BMI is: %.2f\n", calc(weight, height));
        System.out.printf("%s", BMI_STANDARD);
    }

    /**
     * Calculates BMI based on input.
     *
     * Extrapolated for testing purposes.
     *
     * @param weight User weight in pounds
     * @param height User height in inches
     * @return The calculated BMI index.
     */
    public static float calc(int weight, int height) {
        return (Math.abs(weight) * BMI_CONST) / Math.abs(height);
    }
}
