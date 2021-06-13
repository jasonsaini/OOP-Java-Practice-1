/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package assignment2.ex38.base;

public class Solution38 {
    public static void main(String args[])
    {
        ValueFilter filter = new ValueFilter();
        int [] originalValues = filter.promptValues();
        int [] newValues = filter.filterEvenNumbers(originalValues);
        System.out.print("The even numbers are");
        for(int i = 0; i < newValues.length; i++)
        {
            System.out.print(" " + newValues[i]);
        }
        System.out.print(".");
    }
}
