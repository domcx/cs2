package co.levee.cs2.InClass;

import java.util.Date;
import java.util.Random;

/**
 * Created by Dominic Moorman on 9/27/16.
 */
public class Craps {
    private int roll1, roll2, point;
    private boolean onPoint;
    private Random ran = new Random(new Date().getTime());

    public int getPoint() {
        return point;
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

    public void Roll() {
        roll1 = ran.nextInt(6);
        roll2 = ran.nextInt(6);
    }


    public static void main(String[] args) {
        Craps craps = new Craps();
        craps.Roll();
    }
}
