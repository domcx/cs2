package co.levee.cs2.Homework4;

/**
 * Created by Dominic Moorman on 9/27/16.
 *
 */
public class Problem1 {
    public static void main(String[] args) {

        // A
        int c = 0, product = 0; // Define variables
        while (c <= 5) {
            product *= c;
            ++c;
        } // No ending brace

        // B
        int gender = 0;
        if (gender == 1)
            System.out.println("Woman");
        else // Had an extra ';'
            System.out.println("Man");

        int z = 5, sum = 0;
        while (z >= 0) {
            sum += z;
            z--; // No reduction, infinite loop.
        }
    }
}
