/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package assignment2.ex34.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {

    @Test
    void successfully_removes_employee_set1()
    {
        EmployeeList employees = new EmployeeList();
        ArrayList<String> employeeList = employees.initEmployeeList();
        int removalIndex = employeeList.indexOf("John Smith");
        employeeList.remove(removalIndex);
        boolean expected = true;
        boolean actual = !(employeeList.contains("John Smith"));
        assertEquals(expected, actual);
    }

    @Test
    void successfully_removes_employee_set2()
    {
        EmployeeList employees = new EmployeeList();
        ArrayList<String> employeeList = employees.initEmployeeList();
        int removalIndex = employeeList.indexOf("Jackie Jackson");
        employeeList.remove(removalIndex);
        boolean expected = true;
        boolean actual = !(employeeList.contains("Jackie Jackson"));
        assertEquals(expected, actual);
    }

    @Test
    void successfully_removes_employee_set3()
    {
        EmployeeList employees = new EmployeeList();
        ArrayList<String> employeeList = employees.initEmployeeList();
        int removalIndex = employeeList.indexOf("Chris Jones");
        employeeList.remove(removalIndex);
        boolean expected = true;
        boolean actual = !(employeeList.contains("Chris Jones"));
        assertEquals(expected, actual);
    }

    @Test
    void successfully_removes_employee_set4()
    {
        EmployeeList employees = new EmployeeList();
        ArrayList<String> employeeList = employees.initEmployeeList();
        int removalIndex = employeeList.indexOf("Amanda Cullen");
        employeeList.remove(removalIndex);
        boolean expected = true;
        boolean actual = !(employeeList.contains("Amanda Cullen"));
        assertEquals(expected, actual);
    }
    @Test
    void successfully_removes_employee_set5()
    {
        EmployeeList employees = new EmployeeList();
        ArrayList<String> employeeList = employees.initEmployeeList();
        int removalIndex = employeeList.indexOf("Jeremy Goodwin");
        employeeList.remove(removalIndex);
        boolean expected = true;
        boolean actual = !(employeeList.contains("Jeremy Goodwin"));
        assertEquals(expected, actual);
    }




}