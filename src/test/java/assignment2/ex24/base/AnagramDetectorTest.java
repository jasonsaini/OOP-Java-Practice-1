/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {
    @Test
    void isAnagram_returns_true_for_anagrams_set1()
    {
        AnagramDetector detector = new AnagramDetector();
        boolean expected = true;
        boolean actual = detector.isAnagram("note", "tone");

        assertEquals(expected,actual);
    }

    @Test
    void isAnagram_returns_true_for_anagrams_set2()
    {
        AnagramDetector detector = new AnagramDetector();
        boolean expected = true;
        boolean actual = detector.isAnagram("123", "231");

        assertEquals(expected,actual);
    }

    @Test
    void isAnagram_returns_true_for_anagrams_set3()
    {
        AnagramDetector detector = new AnagramDetector();
        boolean expected = true;
        boolean actual = detector.isAnagram("fido", "difo");

        assertEquals(expected,actual);
    }


    @Test
    void isAnagram_returns_false_for_nonanagrams_set1()
    {
        AnagramDetector detector = new AnagramDetector();
        boolean expected = false;
        boolean actual = detector.isAnagram("asdf", "fadss");

        assertEquals(expected,actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagrams_set2()
    {
        AnagramDetector detector = new AnagramDetector();
        boolean expected = false;
        boolean actual = detector.isAnagram("12t", "t13");

        assertEquals(expected,actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagrams_set3()
    {
        AnagramDetector detector = new AnagramDetector();
        boolean expected = false;
        boolean actual = detector.isAnagram("Everyday", "I'm shufflin'");

        assertEquals(expected,actual);
    }
}