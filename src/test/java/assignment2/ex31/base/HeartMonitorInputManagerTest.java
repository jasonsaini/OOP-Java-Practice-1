/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment2.ex31.base;

import java.util.function.BooleanSupplier;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class HeartMonitorInputManagerTest {
    @Test
    void calculate_correct_rate_set1()
    {
        HeartMonitorInputManager inputManager = new HeartMonitorInputManager();
        int expected = 138;
        int actual = inputManager.calculateTargetHeartRate(22,65,55);
        assertEquals(expected,actual);

    }

    @Test
    void calculate_correct_rate_set2()
    {
        HeartMonitorInputManager inputManager = new HeartMonitorInputManager();
        int expected = 145;
        int actual = inputManager.calculateTargetHeartRate(22,65,60);
        assertEquals(expected,actual);
    }

    @Test
    void calculate_correct_rate_set3()
    {
        HeartMonitorInputManager inputManager = new HeartMonitorInputManager();
        int expected = 156;
        int actual = inputManager.calculateTargetHeartRate(25,65,70);
        assertEquals(expected,actual);
    }
}