/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment2.ex29.base;

import java.util.Scanner;

public class Solution29 {
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
                System.out.print("Sorry. That's not a valid input.\n");
            }
        }

        int numYears = calculateYearstoDoubleInvestment(r);
        System.out.print("It will take " + numYears + " years to double your initial investment");

    }
}


