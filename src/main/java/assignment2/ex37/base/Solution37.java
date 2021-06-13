/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package assignment2.ex37.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution37 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String args[])
    {

        PasswordGenerator generator = new PasswordGenerator();

        System.out.print("What is the minimum length? ");
        int minLength = in.nextInt();

        System.out.print("How many special characters? ");
        int numSpecialChars = in.nextInt();

        System.out.print("How many numbers? ");
        int numCount = in.nextInt();

        char[] potentialPassword = generator.generatePassword(minLength,numSpecialChars,numCount);
        String password = new String(potentialPassword);
        System.out.print("Your password is " + password);

    }
}
