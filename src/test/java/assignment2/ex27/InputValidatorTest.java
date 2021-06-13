/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment2.ex27;

import assignment2.ex27.base.InputValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {
    @Test
    void finds_non_valid_employeeID_set1()
    {
        InputValidator validator = new InputValidator();
        String expected = "The employee ID must be in the format AA-1234.\n";
        String actual = validator.IDFormatIsValid("A12-1234");
        assertEquals(expected, actual);
    }

    @Test
    void finds_non_valid_employeeID_set2()
    {
        InputValidator validator = new InputValidator();
        String expected = "The employee ID must be in the format AA-1234.\n";
        String actual = validator.IDFormatIsValid("12A-ABCD");
        assertEquals(expected, actual);
    }


    @Test
    void detects_valid_employeeID_set1()
    {
        InputValidator validator = new InputValidator();
        String expected = "";
        String actual = validator.IDFormatIsValid("TK-4321");
        assertEquals(expected, actual);
    }

    @Test
    void detects_valid_employeeID_set2()
    {
        InputValidator validator = new InputValidator();
        String expected = "";
        String actual = validator.IDFormatIsValid("JS-4207");
        assertEquals(expected, actual);
    }

    @Test
    void detects_valid_filled_name_set1()
    {
        InputValidator validator = new InputValidator();
        boolean expected = true;
        boolean actual = validator.nameIsFilled("Jay");
        assertEquals(expected, actual);
    }
    @Test
    void detects_valid_filled_name_set2()
    {
        InputValidator validator = new InputValidator();
        boolean expected = true;
        boolean actual = validator.nameIsFilled("Johnson");
        assertEquals(expected, actual);
    }

    @Test
    void detects_invalid_filled_name_set1()
    {
        InputValidator validator = new InputValidator();
        boolean expected = false;
        boolean actual = validator.nameIsFilled("");
        assertEquals(expected, actual);
    }

    @Test
    void detects_invalid_filled_name_set2()
    {
        InputValidator validator = new InputValidator();
        boolean expected = false;
        boolean actual = validator.nameIsFilled("          ");
        assertEquals(expected, actual);
    }

    @Test
    void detects_valid_zipCode_set1()
    {
        InputValidator validator = new InputValidator();
        String expected = "";
        String actual = validator.validZipCode("32827");
        assertEquals(expected, actual);
    }

    @Test
    void detects_valid_zipCode_set2()
    {
        InputValidator validator = new InputValidator();
        String expected = "";
        String actual = validator.validZipCode("12345");
        assertEquals(expected, actual);
    }

    @Test
    void detects_valid_zipCode_set3()
    {
        InputValidator validator = new InputValidator();
        String expected = "";
        String actual = validator.validZipCode("55555");
        assertEquals(expected, actual);
    }

    @Test
    void detects_invalid_zipCode_set1()
    {
        InputValidator validator = new InputValidator();
        String expected = "The zipcode must be a 5 digit number.\n";
        String actual = validator.validZipCode("123");
        assertEquals(expected, actual);
    }

    @Test
    void detects_invalid_zipCode_set2()
    {
        InputValidator validator = new InputValidator();
        String expected = "The zipcode must be a 5 digit number.\n";
        String actual = validator.validZipCode("ABCDEF");
        assertEquals(expected, actual);
    }


}