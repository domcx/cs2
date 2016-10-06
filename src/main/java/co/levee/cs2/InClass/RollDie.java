package co.levee.cs2.InClass;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Dominic Moorman on 10/4/16.
 */
public class RollDie {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] nums = new int[6];
        for (int i = 0; i < nums.length * 1000000; i++) {
            nums[ran.nextInt(nums.length)]++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
