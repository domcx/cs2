package co.levee.cs2.Homework4;

import java.util.Scanner;

/**
 * Created by Dominic Moorman on 9/21/16.
 */
public class YourCarTrip {
    private static final int AvgMPG = 20;

    private double distance;
    private double minutes;
    private double gallons;

    public void drive(double distance, int speed) {
        this.distance += distance;
        minutes += (distance / speed) * 60;
        gallons += distance / AvgMPG;
    }

    public double getDistance() {
        return distance;
    }

    public double getMinutes() {
        return minutes;
    }

    public double getGallons() {
        return gallons;
    }

    public static void main(String[] args) {
        YourCarTrip yct = new YourCarTrip();
        Scanner sc = new Scanner(System.in);

        System.out.println("How much gas do you have?");
        double have = sc.nextDouble();
        System.out.println("How many parts to your trip?");
        int legs = sc.nextInt();

        System.out.printf("Begin entering your journey by typing: '2.0 60'.\n\tWhere 2 is the miles driven and 60 is the speed.\n\tEnter an empty line to stop.\n");
        sc.nextLine();
        for (;legs > 0; legs--) {
            String s = sc.nextLine();
            if (s.length() <= 1) break;
            String[] split = s.split(" ");
            yct.drive(Double.parseDouble(split[0]), Integer.parseInt(split[1]));
        }
        System.out.printf("Time driving %smin, with %s miles.\n", yct.minutes, yct.distance);
        System.out.printf("Gallons required is %s, you will %s gas to get there and back.\n", yct.gallons, ((have - (yct.gallons * 2)) < 0 ? "need more" : "have enough"));
    }

}
