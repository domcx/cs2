package co.levee.cs2.Homework3;

import java.util.Scanner;

/**
 * Created by Dominic Moorman on 9/21/16.
 */
public class LetterGrade {

    private static String[] Grader = new String[]{"A", "A", "B", "C", "D", "F"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, total = 0, input, grade;
        while (i++ > -1) {
            System.out.printf("Enter grade (1-100): ");
            input = sc.nextInt();
            if (input == 0) break;
            total += input;
            System.out.printf("Your Letter Grade is: %s\n", work(input));
        }
        System.out.printf("Average for these %d grades is: %d\n", i, total / i);
    }

    public static String work(int input) {
        int grade;
        grade = 10 - (input / 10);
        if (grade >= Grader.length)
            grade = Grader.length - 1;
        return Grader[grade];
    }
}
