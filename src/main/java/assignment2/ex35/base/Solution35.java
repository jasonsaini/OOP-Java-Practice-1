/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package assignment2.ex35.base;

import assignment2.ex34.base.EmployeeList;

import java.util.Scanner;
import java.util.ArrayList;


public class Solution35 {
    public static void main(String args[])
    {
        NamesList employees = new NamesList();
        ArrayList<String> list = employees.generateNamesList();
        String winner = employees.generateWinningName(list);
        System.out.println("The winner is... " + winner + ".");
    }
}
