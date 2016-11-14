package co.levee.cs2.InClass;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Dominic Moorman on 11/1/16.
 */
public class DivideByZeroExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        while(true) {
            try {
                System.out.printf("Enter numerator: ");
                n1 = sc.nextInt();
                System.out.printf("Enter denominator: ");
                n2 = sc.nextInt();

                System.out.printf("%s/%s is %s\n", n1, n2, n1/n2);
                break;
            } catch (Exception e) {
                System.out.printf("Exception: %s\n", e);
            }
            JOptionPane.showMessageDialog(null, "MEMES", "XD", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
