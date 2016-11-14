package co.levee.cs2.Homework6;

/**
 * Created by Dominic Moorman on 10/19/16.
 */
public class Question1 {

    private int min = -1, max = -1;
    private double avg;
    private int[] distrib;

    public Question1(int[] using) {
        distrib = new int[10];
        for (int a : using) {
            if (min == -1 || a < min)
                min = a;
            if (a > max)
                max = a;
            avg += a;
            int dis = (a / 10);
            if (dis == 10) dis--;
            distrib[dis]++;
        }
        avg /= using.length;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public double getAvg() {
        return avg;
    }

    public void printBarChart() {
        for (int i = 0; i < distrib.length; i++) {
            System.out.printf(" (%02d-%02d)%s", i * 10, ((i == 9) ? 100 : i * 10 + 9), i == 9 ? " " : "  ");
            for (int a = 0; a < distrib[i]; a++) {
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
