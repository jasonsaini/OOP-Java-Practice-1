package assignment2.ex37.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    public static String specialChars = "!@#$%^&*()+~`";
    public static String numbers = "0123456789";

    public static int numChars(String toCheck, char[] password)
    {
        int count = 0;
        for(int i = 0; i < password.length; i++)
        {
            if(toCheck.indexOf(password[i]) != -1)
            {
                count++;
            }
        }
        return count;
    }


    public static boolean meetsAllCriteria(char [] password, int minLength, int numSpecialChars, int numCount)
    {
        if(password.length != minLength)
        {
            return false;
        }

        int specialCharCount = numChars(specialChars, password);
        if(specialCharCount != numSpecialChars)
        {
            return false;
        }

        int numsInPassword = numChars(numbers, password);
        if(numsInPassword != numCount)
        {
            return false;
        }

        return true;
    }

    @Test
    void password_meets_all_criteria_set1()
    {
        int minLength = 8, numSpecialChars = 2, numCount = 2;
        PasswordGenerator generator = new PasswordGenerator();
        boolean expected = true;
        char[] password = generator.generatePassword(minLength,numSpecialChars,numCount);
        boolean actual = meetsAllCriteria(password,minLength,numSpecialChars,numCount);
        assertEquals(expected,actual);
    }

    @Test
    void password_meets_all_criteria_set2()
    {
        int minLength = 5, numSpecialChars = 1, numCount = 1;
        PasswordGenerator generator = new PasswordGenerator();
        boolean expected = true;
        char[] password = generator.generatePassword(minLength,numSpecialChars,numCount);
        boolean actual = meetsAllCriteria(password,minLength,numSpecialChars,numCount);
        assertEquals(expected,actual);
    }

    @Test
    void password_meets_all_criteria_set3()
    {
        int minLength = 12, numSpecialChars = 5, numCount = 5;
        PasswordGenerator generator = new PasswordGenerator();
        boolean expected = true;
        char[] password = generator.generatePassword(minLength,numSpecialChars,numCount);
        boolean actual = meetsAllCriteria(password,minLength,numSpecialChars,numCount);
        assertEquals(expected,actual);
    }

    @Test
    void password_meets_all_criteria_set4()
    {
        int minLength = 15, numSpecialChars = 5, numCount = 5;
        PasswordGenerator generator = new PasswordGenerator();
        boolean expected = true;
        char[] password = generator.generatePassword(minLength,numSpecialChars,numCount);
        boolean actual = meetsAllCriteria(password,minLength,numSpecialChars,numCount);
        assertEquals(expected,actual);
    }

    @Test
    void password_meets_all_criteria_set5()
    {
        int minLength = 18, numSpecialChars = 10, numCount = 7;
        PasswordGenerator generator = new PasswordGenerator();
        boolean expected = true;
        char[] password = generator.generatePassword(minLength,numSpecialChars,numCount);
        boolean actual = meetsAllCriteria(password,minLength,numSpecialChars,numCount);
        assertEquals(expected,actual);
    }

    @Test
    void password_meets_all_criteria_set6()
    {
        int minLength = 4, numSpecialChars = 2, numCount = 1;
        PasswordGenerator generator = new PasswordGenerator();
        boolean expected = true;
        char[] password = generator.generatePassword(minLength,numSpecialChars,numCount);
        boolean actual = meetsAllCriteria(password,minLength,numSpecialChars,numCount);
        assertEquals(expected,actual);
    }

}