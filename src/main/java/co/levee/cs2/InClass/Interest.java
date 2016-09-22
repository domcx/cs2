package co.levee.cs2.InClass;

/**
 * Created by Dominic Moorman on 9/20/16.
 */
public class Interest {
    public static void main(String[] main) {
        double amount, principal = 1000.0, rate = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for(int y = 1; y <= 10; ++y) {
            amount = principal * Math.pow(1.0 + rate, y);

            System.out.printf("%4d,20.2f%n", y, amount);
        }
    }
}
