/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package assignment2.ex37.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {
    public static int getNumSpecialChars(char[] password)
    {
        String specialChars = "!@#$%^&*()+~`";
        int specialCharCount = 0;
        for(int i = 0; i < password.length; i++)
        {
            if (specialChars.contains(String.valueOf(password[i])))
            {
                specialCharCount++;
            }
        }
        return specialCharCount;
    }

    public static int getNumCount(char[] password)
    {
        int numCount = 0;
        for(int i = 0; i < password.length; i++)
        {
            if (Character.isDigit(password[i]))
            {
                numCount++;
            }
        }
        return numCount;
    }

    @Test
    void sets_correct_length_set1()
    {
        PasswordGenerator generator = new PasswordGenerator();
        int sampleLength = 10;

        int expected = sampleLength;
        int actual = generator.generatePassword(sampleLength, 2,2).length;

        assertEquals(expected,actual);
    }

    @Test
    void sets_correct_length_set2()
    {
        PasswordGenerator generator = new PasswordGenerator();
        int sampleLength = 13;

        int expected = sampleLength;
        int actual = generator.generatePassword(sampleLength, 2,2).length;

        assertEquals(expected,actual);
    }

    @Test
    void sets_correct_length_set3()
    {
        PasswordGenerator generator = new PasswordGenerator();
        int sampleLength = 26;

        int expected = sampleLength;
        int actual = generator.generatePassword(sampleLength, 2,2).length;

        assertEquals(expected,actual);
    }

    @Test
    void sets_correct_num_special_chars_set1()
    {
        PasswordGenerator generator = new PasswordGenerator();
        int numChars = 2;
        int expected = numChars;
        char[] password = generator.generatePassword(10, numChars,0);
        int actual = getNumSpecialChars(password);
        assertEquals(expected,actual);
    }

    @Test
    void sets_correct_num_special_chars_set2()
    {
        PasswordGenerator generator = new PasswordGenerator();
        int numChars = 0;
        int expected = numChars;
        char[] password = generator.generatePassword(10, numChars,0);
        int actual = getNumSpecialChars(password);
        assertEquals(expected,actual);
    }

    @Test
    void sets_correct_num_special_chars_set3()
    {
        PasswordGenerator generator = new PasswordGenerator();
        int numChars = 10;
        int expected = numChars;
        char[] password = generator.generatePassword(10, numChars,0);
        int actual = getNumSpecialChars(password);
        assertEquals(expected,actual);
    }

    @Test
    void sets_correct_numCount_set1()
    {
        PasswordGenerator generator = new PasswordGenerator();
        int numCount = 1;
        int expected = numCount;
        char[] password = generator.generatePassword(10, 0,numCount);
        int actual = getNumCount(password);
        assertEquals(expected,actual);
    }

    @Test
    void sets_correct_numCount_set2()
    {
        PasswordGenerator generator = new PasswordGenerator();
        int numCount = 6;
        int expected = numCount;
        char[] password = generator.generatePassword(15, 0, numCount);
        int actual = getNumCount(password);
        assertEquals(expected,actual);
    }

    @Test
    void sets_correct_numCount_set3()
    {
        PasswordGenerator generator = new PasswordGenerator();
        int numCount = 0;
        int expected = numCount;
        char[] password = generator.generatePassword(10, 0,numCount);
        int actual = getNumCount(password);
        assertEquals(expected,actual);
    }

    @Test
    void sets_correct_numCount_set4()
    {
        PasswordGenerator generator = new PasswordGenerator();
        int numCount = 8;
        int expected = numCount;
        char[] password = generator.generatePassword(10, 0,numCount);
        int actual = getNumCount(password);
        assertEquals(expected,actual);
    }




}