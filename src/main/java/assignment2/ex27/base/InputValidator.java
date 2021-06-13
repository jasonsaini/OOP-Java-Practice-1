/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment2.ex27.base;

import java.lang.*;
import java.util.*;

public class InputValidator {

    public static boolean nameIsFilled(String name)
    {
        if( name.trim().length() == 0)
        {
            return false;
        }
        return true;
    }

    public static boolean nameIsMinLength(String name)
    {
        return name.length() >= 2;
    }


    public static String IDFormatIsValid(String EmployeeID)
    {
        String letters, numbers;
        char hyphen;
        boolean isValid = true;
        if(EmployeeID.length() != 7)
        {
            isValid = false;
        }
        else {
            letters = EmployeeID.substring(0, 2);

            char[] letters_arr = letters.toCharArray();
            if (letters.length() != 2) {
                isValid = false;
            } else {
                for (int i = 0; i < letters.length(); i++) {
                    if (Character.isDigit(letters_arr[i])) {
                        isValid = false;
                    }
                }
            }
            hyphen = EmployeeID.charAt(2);
            if (hyphen != '-') {
                isValid = false;
            } else {
                numbers = EmployeeID.substring(3, 7);
                char[] num_array = numbers.toCharArray();
                for (int i = 0; i < numbers.length(); i++) {
                    if (!Character.isDigit(num_array[i])) {
                        isValid = false;
                    }
                }
            }
        }
        if (isValid)
        {
            return "";
        }
        else
        {
            return "The employee ID must be in the format AA-1234.\n";
        }
    }

    public static String validZipCode(String zipCode)
    {
        String error = "The zipcode must be a 5 digit number.\n";
        if (zipCode.length() != 5)
        {
            return error;
        }
        else
        {
            char [] nums = zipCode.toCharArray();
            for(int i = 0; i < 5; i++)
            {
                if(!Character.isDigit(nums[i]))
                {
                    return error;
                }
            }
        }
        error = "";
        return error;

    }

    public static String validateInput(String firstName, String lastName, String EmployeeID, String zipCode) {
        String validationString = "";

        if(!nameIsMinLength(firstName))
        {
            validationString += "The first name must be at least 2 characters long.\n";
        }
        if(!nameIsFilled(firstName))
        {
            validationString += "The first name must be filled in.\n";
        }
        if(!nameIsMinLength(lastName))
        {
            validationString += "The last name must be at least 2 characters long.\n";
        }
        if(!nameIsFilled(lastName))
        {
            validationString += "The last name must be filled in.\n";
        }
        validationString += IDFormatIsValid(EmployeeID);
        validationString += validZipCode(zipCode);

        return validationString;
    }



}
