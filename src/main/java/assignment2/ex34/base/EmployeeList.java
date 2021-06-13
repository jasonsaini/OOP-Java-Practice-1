/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package assignment2.ex34.base;

import java.util.ArrayList;

public class EmployeeList {
    public static ArrayList<String> initEmployeeList()
    {
        ArrayList<String> employees = new ArrayList<String>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        return employees;
    }
    public static void removeEmployee(ArrayList<String> employees, String employeeName)
    {
        int removalIndex = employees.indexOf(employeeName);
        employees.remove(removalIndex);
    }

    public static void printEmployees(ArrayList<String> employees)
    {
        int numEmployees = employees.size();
        System.out.printf("There are %d employees:\n", numEmployees);
        for(int i = 0; i < numEmployees; i++)
        {
            System.out.println(employees.get(i));
        }
    }
}
