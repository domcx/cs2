package co.levee.cs2.Homework6;

/**
 * Created by Dominic Moorman on 10/19/16.
 */
public class Question2 {
    public static void main(String[] args) {
        Iterator(new int[][]{{1, 2, 4, 123412, 3}, {5, 3, 3458, 292}});
    }

    public static void Iterator(int[][] a) {
        System.out.println("Values by row.");
        int items = 0;
        double buf = 0;
        for (int[] anA : a) {
            for (int col = 0; col < anA.length; col++, items++) {
                System.out.printf("%s ", anA[col]);
                buf += anA[col];
            }
            System.out.println();
        }
        buf /= items;
        System.out.printf("The average value is: %.2f\n", buf);
    }
}
