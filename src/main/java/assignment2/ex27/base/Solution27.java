/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment2.ex27.base;

import java.util.Scanner;

public class Solution27 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        InputValidator validator = new InputValidator();

        String firstName, lastName, employeeID, zipCode;

        System.out.print("Enter the first name: ");
        firstName = in.nextLine();

        System.out.print("Enter the last name: ");
        lastName = in.nextLine();

        System.out.print("Enter the ZIP code: ");
        zipCode = in.nextLine();

        System.out.print("Enter the employee ID: ");
        employeeID = in.nextLine();

        String output = validator.validateInput(firstName,lastName, employeeID,zipCode);
        if(output.equals(""))
        {
            System.out.print("There were no errors found.");
        }
        else
        {
            System.out.print(output);
        }

    }

}
