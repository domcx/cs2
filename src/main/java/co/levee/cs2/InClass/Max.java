package co.levee.cs2.InClass;

/**
 * Created by Dominic Moorman on 9/27/16.
 */
public class Max {
    public static double maximum(double... vals) {
        if (vals.length <= 0) {
            return 0;
        }
        double max = vals[0];
        for (double val : vals) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
}
