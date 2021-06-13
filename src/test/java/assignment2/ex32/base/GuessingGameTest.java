/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment2.ex32.base;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GuessingGameTest {
    @Test
    void generates_valid_number_in_range_diff1_set1()
    {
        GuessingGame game = new GuessingGame();
        int randNum = game.generateRandomNumber(1);

    }

    @Test
    void generates_valid_number_in_range_diff1_set2()
    {
        GuessingGame game = new GuessingGame();
        int randNum = game.generateRandomNumber(1);
        assertTrue(1 <= randNum && randNum <= 100);
    }

    @Test
    void generates_valid_number_in_range_diff1_set3()
    {
        GuessingGame game = new GuessingGame();
        int randNum = game.generateRandomNumber(1);
        assertTrue(1 <= randNum && randNum <= 100);
    }

    @Test
    void generates_valid_number_in_range_diff2_set1()
    {
        GuessingGame game = new GuessingGame();
        int randNum = game.generateRandomNumber(2);
        assertTrue(1 <= randNum && randNum <= 100);
    }

    @Test
    void generates_valid_number_in_range_diff2_set2()
    {
        GuessingGame game = new GuessingGame();
        int randNum = game.generateRandomNumber(2);
        assertTrue(1 <= randNum && randNum <= 100);
    }

    @Test
    void generates_valid_number_in_range_diff2_set3()
    {
        GuessingGame game = new GuessingGame();
        int randNum = game.generateRandomNumber(2);
        assertTrue(1 <= randNum && randNum <= 100);
    }

    @Test
    void generates_valid_number_in_range_diff3_set1()
    {
        GuessingGame game = new GuessingGame();
        int randNum = game.generateRandomNumber(3);
        assertTrue(1 <= randNum && randNum <= 1000);
    }

    @Test
    void generates_valid_number_in_range_diff3_set2()
    {
        GuessingGame game = new GuessingGame();
        int randNum = game.generateRandomNumber(3);
        assertTrue(1 <= randNum && randNum <= 1000);
    }

    @Test
    void generates_valid_number_in_range_diff3_set3()
    {
        GuessingGame game = new GuessingGame();
        int randNum = game.generateRandomNumber(3);
        assertTrue(1 <= randNum && randNum <= 1000);
    }

}