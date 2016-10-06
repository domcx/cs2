package co.levee.cs2.InClass;

import java.util.Date;
import java.util.Random;

/**
 * Created by Dominic Moorman on 9/27/16.
 */
public class Craps {
    private int roll1, roll2, sum;
    private boolean onPoint;
    private Random ran = new Random(new Date().getTime());

    private Result LastResult;

    public enum Result {
        Win, Loss, Point
    }

    public int getPoint() {
        return sum;
    }

    public int getRoll1() {
        return roll1;
    }

    public int getRoll2() {
        return roll2;
    }

    public boolean isOnPoint() {
        return onPoint;
    }

    private void reset() {
        sum = 0;
        roll1 = 0;
        roll2 = 0;
        onPoint = false;
    }

    public Result Roll() {
        if (this.LastResult != null && this.LastResult != Result.Point)
            reset();

        roll1 = ran.nextInt(6) + 1;
        roll2 = ran.nextInt(6) + 1;
        int sum = roll1 + roll2;

        Result res = Result.Point;
        // Operate on the point
        if (onPoint) {
            if (sum == 7)
                res = Result.Loss;
            else if (sum == this.sum)
                res = Result.Win;
        }
        else { // Operate on a new roll
            if (sum == 7 || sum == 11)
                res = Result.Win;
            else if (sum == 2 || sum == 3 || sum == 12)
                res = Result.Loss;
            else {
                onPoint = true;
                this.sum = sum;
            }
        }

        LastResult = res;
        return res;
    }


    public static void main(String[] args) {
        Craps craps = new Craps();
        Result res;
        int i = 0;
        while (i < 100) {
            System.out.printf("[%s] ", ++i);
            res = craps.Roll();
            if (res == Result.Point) {
                System.out.printf("Point! You got %s, we want %s\n", craps.getRoll1() + craps.getRoll2(), craps.getPoint());
                continue;
            }
            System.out.printf("Rolled %s + %s = %s. %s\n", craps.getRoll1(), craps.getRoll2(), craps.getRoll1() + craps.getRoll2(), (res == Result.Win) ? "You Won!" : "You loose :(");
        }
    }
}
