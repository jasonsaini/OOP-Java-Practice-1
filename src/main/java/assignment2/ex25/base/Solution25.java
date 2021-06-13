/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment2.ex25.base;
import java.util.Scanner;

public class Solution25 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        PasswordStrengthIndicator indicator = new PasswordStrengthIndicator();
        String password, strength;

        System.out.print("Enter a password to determine its strength: ");
        password = in.nextLine();

        strength = indicator.getPasswordStrength(password);

        System.out.println("The password " + "\'" + password + "\'" + " is a " + strength + " password.");
    }
}