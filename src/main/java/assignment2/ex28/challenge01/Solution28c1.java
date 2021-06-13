/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment2.ex28.challenge01;
//Modify the program to prompt for how many numbers to add, instead of hard-coding the value. Be sure you convert the input to a number before doing the comparison.
import java.util.Scanner;
public class Solution28c1 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("How many numbers do you want to add? ");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter a number: ");
            sum += in.nextInt();
        }
        System.out.println("The total is " + sum + ".");
    }
}
