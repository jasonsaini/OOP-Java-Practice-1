/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment2.ex29.challenge01;
//Display a different error message when the user enters 0.

import java.util.Scanner;

public class Solution29c1 {
    private static Scanner in = new Scanner(System.in);

    public static int calculateYearstoDoubleInvestment(double r) {
        return (int)Math.ceil(72 / r);
    }

    public static void main(String args[]) {
        double r = -1;
        while (r == -1 || r == 0) {
            try {
                System.out.print("What is the rate of return? ");
                r = in.nextInt();
            } catch (Exception e) {
                in.nextLine();
                System.out.print("Sorry. That's not a valid input.\n");
                continue;
            }
            if (r == 0)
            {
                // Different error message for 0
                System.out.print("You can't have 0 as a rate of return!\n");
            }
        }

        int numYears = calculateYearstoDoubleInvestment(r);
        System.out.print("It will take " + numYears + " years to double your initial investment");

    }
}
