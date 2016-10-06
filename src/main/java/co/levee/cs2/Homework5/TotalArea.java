package co.levee.cs2.Homework5;

import java.util.Scanner;

/**
 * Created by Dominic Moorman on 10/5/16.
 */
public class TotalArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        while(true) {
            String buf = sc.nextLine();
            if (buf.length() < 3) break;
            String[] split = buf.split(" ");
            String op = split[0].toLowerCase();
            if (op.startsWith("rec"))
                total += CalcArea.Rectangle(Double.parseDouble(split[1]), Double.parseDouble(split[2]));
            else if (op.startsWith("cir"))
                total += CalcArea.Circle(Double.parseDouble(split[1]));
            else if (op.startsWith("tri"))
                total += CalcArea.Triangle(Double.parseDouble(split[1]), Double.parseDouble(split[2]));
            System.out.printf("Area is now %s\n", total);
        }
        System.out.printf("Total area calculated is %s\n", total);
    }
}
