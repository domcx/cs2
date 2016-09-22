package co.levee.cs2.InClass;

/**
 * Created by Dominic Moorman on 9/13/16.
 */
public class Calculate {

    public static void main(String[] args) {
        int sum;
        int x;

        x=1;
        sum = 0;
        while(x <= 10) {
            sum += x;
            ++x;
        }
        System.out.printf("This sum is %d\n", sum);
    }
}
