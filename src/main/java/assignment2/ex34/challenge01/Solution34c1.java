/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package assignment2.ex34.challenge01;
//If the user enters a name that’s not found, print out an error message stating that the name does not exist.

import java.util.ArrayList;
import java.util.Scanner;

public class Solution34c1 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        EmployeeList list = new EmployeeList();
        ArrayList<String> employees  = EmployeeList.initEmployeeList();

        list.printEmployees(employees);

        System.out.print("Enter an employee name to remove: ");
        String employeeToRemove = in.nextLine();

        System.out.println();
        list.removeEmployee(employees, employeeToRemove);
        list.printEmployees(employees);
    }
}
