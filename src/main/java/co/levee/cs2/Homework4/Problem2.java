package co.levee.cs2.Homework4;

/**
 * Created by Dominic Moorman on 9/27/16.
 */
public class Problem2 {
    public static void main(String[] args) {
        // A
        int age = 0; // Create variable
        if (age >= 65) // Removed excess ';'
            System.out.println("Age is greater than or equal to 65");
        else
            System.out.println("Age is less than 65"); // Closing parenthesis was included within the string.

        // B
        int x = 1, total = 0; // Total was not initialized
        while (x <= 10) {
            total += x; // Total should be total
            ++x;
        }

        // C
        while (x <= 100) {
            total += x;
            ++x;
        } // Needed braces, only one line had been included.

        // D
        int y = 0; // Variable y did not exist
        while (y > 0) {
            System.out.println(y);
            ++y;
        }
    }
}
