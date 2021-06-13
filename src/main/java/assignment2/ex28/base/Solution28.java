/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment2.ex28.base;

import java.util.Scanner;

public class Solution28 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String args[])
    {
        int sum = 0;
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            sum += in.nextInt();
        }
        System.out.println("The total is " + sum + ".");
    }
}
