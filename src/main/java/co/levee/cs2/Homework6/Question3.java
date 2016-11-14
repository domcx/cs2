package co.levee.cs2.Homework6;

import java.util.Arrays;

/**
 * Created by Dominic Moorman on 10/19/16.
 */
public class Question3 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(Append(a1, a2)));
    }

    /**
     * Please note that doing this type of thing with arrays is memory expensive.
     * A new array of both sizes must be allocated from the heap and the old arrays
     * will be picked up by the GC. It is costly and time consuming.
     **/
    public static int[] Append(int[] a, int[] a2) {
        int[] buf = new int[a.length + a2.length];
        int i = 0;
        for (int val : a) buf[i++] = val;
        for (int val : a2) buf[i++] = val;
        return buf;
    }
}
