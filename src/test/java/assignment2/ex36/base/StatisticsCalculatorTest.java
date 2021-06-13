/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package assignment2.ex36.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsCalculatorTest {

    public static ArrayList<Integer> generateSample1()
    {
        ArrayList<Integer> sampleSet1 = new ArrayList<Integer>();
        sampleSet1.add(100);
        sampleSet1.add(200);
        sampleSet1.add(1000);
        sampleSet1.add(300);
        return sampleSet1;
    }

    public static ArrayList<Integer> generateSample2()
    {
        ArrayList<Integer> sampleSet = new ArrayList<Integer>();
        sampleSet.add(-100);
        sampleSet.add(-200);
        sampleSet.add(-1000);
        sampleSet.add(-300);
        return sampleSet;
    }

    public static ArrayList<Integer> generateSample3()
    {
        ArrayList<Integer> sampleSet = new ArrayList<Integer>();
        sampleSet.add(100);
        sampleSet.add(-200);
        sampleSet.add(0);
        sampleSet.add(999999);
        return sampleSet;
    }

    public static ArrayList<Integer> generateSample4()
    {
        ArrayList<Integer> sampleSet = new ArrayList<Integer>();
        sampleSet.add(0);
        sampleSet.add(0);
        sampleSet.add(0);
        sampleSet.add(0);
        return sampleSet;
    }

    @Test
    void calculates_std_set1()
    {   StatisticsCalculator calculator = new StatisticsCalculator();
        double expected = 353.55;
        double actual = calculator.std(generateSample1());
        assertEquals(expected, actual, 0.01);
    }

    @Test
    void calculates_std_set2()
    {   StatisticsCalculator calculator = new StatisticsCalculator();
        double expected = 353.55;
        double actual = calculator.std(generateSample2());
        assertEquals(expected, actual, 0.01);
    }

    @Test
    void calculates_std_set3()
    {   StatisticsCalculator calculator = new StatisticsCalculator();
        double expected = 433026.716;
        double actual = calculator.std(generateSample3());
        assertEquals(expected, actual, 0.01);
    }
    @Test
    void calculates_std_set4()
    {   StatisticsCalculator calculator = new StatisticsCalculator();
        double expected = 0;
        double actual = calculator.std(generateSample4());
        assertEquals(expected, actual, 0.01);
    }

    @Test
    void calculate_average_set1()
    {
        StatisticsCalculator calculator = new StatisticsCalculator();
        double expected = 400;
        double actual = calculator.average(generateSample1());
        assertEquals(actual,expected);
    }

    @Test
    void calculate_average_set2()
    {
        StatisticsCalculator calculator = new StatisticsCalculator();
        double expected = -400;
        double actual = calculator.average(generateSample2());
        assertEquals(actual,expected);
    }

    @Test
    void calculate_average_set3()
    {
        StatisticsCalculator calculator = new StatisticsCalculator();
        double expected = 249974.75;
        double actual = calculator.average(generateSample3());
        assertEquals(actual,expected);
    }

    @Test
    void calculate_average_set4()
    {
        StatisticsCalculator calculator = new StatisticsCalculator();
        double expected = 0;
        double actual = calculator.average(generateSample4());
        assertEquals(actual,expected);
    }

    @Test
    void returns_min_set1()
    {
        StatisticsCalculator calculator = new StatisticsCalculator();
        double expected = 100;
        double actual = calculator.min(generateSample1());
        assertEquals(expected,actual);
    }

    @Test
    void returns_min_set2()
    {
        StatisticsCalculator calculator = new StatisticsCalculator();
        double expected = -1000;
        double actual = calculator.min(generateSample2());
        assertEquals(expected,actual);
    }

    @Test
    void returns_min_set3()
    {
        StatisticsCalculator calculator = new StatisticsCalculator();
        double expected = -200;
        double actual = calculator.min(generateSample3());
        assertEquals(expected,actual);
    }

    @Test
    void returns_min_set4()
    {
        StatisticsCalculator calculator = new StatisticsCalculator();
        double expected = 0;
        double actual = calculator.min(generateSample4());
        assertEquals(expected,actual);
    }

    @Test
    void returns_max_set1()
    {
        StatisticsCalculator calculator = new StatisticsCalculator();
        double expected = 1000;
        double actual = calculator.max(generateSample1());
        assertEquals(expected,actual);
    }

    @Test
    void returns_max_set2()
    {
        StatisticsCalculator calculator = new StatisticsCalculator();
        double expected = -100;
        double actual = calculator.max(generateSample2());
        assertEquals(expected,actual);
    }

    @Test
    void returns_max_set3()
    {
        StatisticsCalculator calculator = new StatisticsCalculator();
        double expected = 999999;
        double actual = calculator.max(generateSample3());
        assertEquals(expected,actual);
    }

    @Test
    void returns_max_set4()
    {
        StatisticsCalculator calculator = new StatisticsCalculator();
        double expected = 0;
        double actual = calculator.max(generateSample4());
        assertEquals(expected,actual);
    }



}