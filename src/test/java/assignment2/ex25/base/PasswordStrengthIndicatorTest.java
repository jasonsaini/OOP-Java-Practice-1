/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment2.ex25.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthIndicatorTest {

    @Test
    void detects_very_weak_password_set1()
    {
        PasswordStrengthIndicator indicator = new PasswordStrengthIndicator();
        String expected = "very weak";
        String actual = indicator.getPasswordStrength("12345");
        assertEquals(expected,actual);
    }

    @Test
    void detects_very_weak_password_set2()
    {
        PasswordStrengthIndicator indicator = new PasswordStrengthIndicator();
        String expected = "very weak";
        String actual = indicator.getPasswordStrength("1");
        assertEquals(expected,actual);
    }

    @Test
    void detects_very_weak_password_set3()
    {
        PasswordStrengthIndicator indicator = new PasswordStrengthIndicator();
        String expected = "very weak";
        String actual = indicator.getPasswordStrength("1234567");
        assertEquals(expected,actual);
    }

    @Test
    void detects_weak_password_set1()
    {
        PasswordStrengthIndicator indicator = new PasswordStrengthIndicator();
        String expected = "weak";
        String actual = indicator.getPasswordStrength("ab");
        assertEquals(expected,actual);
    }

    @Test
    void detects_weak_password_set2()
    {
        PasswordStrengthIndicator indicator = new PasswordStrengthIndicator();
        String expected = "weak";
        String actual = indicator.getPasswordStrength("JAVA");
        assertEquals(expected,actual);
    }

    @Test
    void detects_weak_password_set3()
    {
        PasswordStrengthIndicator indicator = new PasswordStrengthIndicator();
        String expected = "weak";
        String actual = indicator.getPasswordStrength("JasonSa");
        assertEquals(expected,actual);
    }

    @Test
    void detects_strong_password_set1()
    {
        PasswordStrengthIndicator indicator = new PasswordStrengthIndicator();
        String expected = "strong";
        String actual = indicator.getPasswordStrength("abc123xyz");
        assertEquals(expected,actual);
    }

    @Test
    void detects_strong_password_set2()
    {
        PasswordStrengthIndicator indicator = new PasswordStrengthIndicator();
        String expected = "strong";
        String actual = indicator.getPasswordStrength("abcd1234");
        assertEquals(expected,actual);
    }

    @Test
    void detects_strong_password_set3()
    {
        PasswordStrengthIndicator indicator = new PasswordStrengthIndicator();
        String expected = "strong";
        String actual = indicator.getPasswordStrength("123xyz2a1234234");
        assertEquals(expected,actual);
    }

    @Test
    void detects_very_strong_password_set1()
    {
        PasswordStrengthIndicator indicator = new PasswordStrengthIndicator();
        String expected = "very strong";
        String actual = indicator.getPasswordStrength("!JasonIsTheBest!2@3");
        assertEquals(expected,actual);
    }

    @Test
    void detects_very_strong_password_set2()
    {
        PasswordStrengthIndicator indicator = new PasswordStrengthIndicator();
        String expected = "very strong";
        String actual = indicator.getPasswordStrength("C++isTheBest101");
        assertEquals(expected,actual);
    }

    @Test
    void detects_very_strong_password_set3()
    {
        PasswordStrengthIndicator indicator = new PasswordStrengthIndicator();
        String expected = "very strong";
        String actual = indicator.getPasswordStrength("1337h@xor!");
        assertEquals(expected,actual);
    }




}