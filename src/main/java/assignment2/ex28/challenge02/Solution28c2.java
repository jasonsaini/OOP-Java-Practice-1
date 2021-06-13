/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment2.ex28.challenge02;
//Modify the program so that it only adds numbers and silently rejects non-numeric values. Count these invalid entries as attempts anyway.
// In other words, if the number of numbers to add is 5, your program should still prompt only five times.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution28c2 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String args[])
    {
        int sum = 0;
        for(int i = 0; i < 5; i++)
        {
            try
            {
                System.out.print("Enter a number: ");
                int buffer = in.nextInt();
                sum += buffer;
            }
            catch(Exception e)
            {
                // clears scanner
                in.nextLine();
                continue;
            }

        }
        System.out.println("The total is " + sum + ".");
    }
}
