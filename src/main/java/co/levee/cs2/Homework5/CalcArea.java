package co.levee.cs2.Homework5;

/**
 * Created by Dominic Moorman on 10/5/16.
 */
public class CalcArea {
    public static double Circle(double r) {
        return Math.PI * (r * r);
    }

    public static double Rectangle(double height, double width) {
        return (height * width);
    }

    public static double Triangle(double height, double width) {
        return Rectangle(height, width) / 2;
    }
}
