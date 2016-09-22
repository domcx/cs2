package co.levee.cs2.InClass;

import java.util.Scanner;

/**
 * Created by Dominic Moorman on 9/13/16.
 */
public class Analysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
        int result;

        while(studentCounter <=10) {
            result = sc.nextInt();

            if (result == 1)
                passes++;
            else
                failures++;

            studentCounter++;
        }

        System.out.printf("Passed: %d\nFailed: %d\n", passes, failures);

        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }
}
