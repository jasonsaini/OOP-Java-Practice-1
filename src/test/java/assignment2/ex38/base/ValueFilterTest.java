/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package assignment2.ex38.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValueFilterTest {

    public static boolean allAreEven(int[] in)
    {
        for(int i = 0; i < in.length; i++)
        {
            if(in[i] % 2 != 0)
            {
                return false;
            }
        }
        return true;
    }

    public static int[] generateSample1()
    {
        int [] sample = {1,2,3,4,5,6,7,8};
        return sample;
    }

    public static int[] generateSample2()
    {
        int [] sample = {2,4,6,8,10,12,14};
        return sample;
    }

    public static int[] generateSample3()
    {
        int [] sample = {1,3,5,7,8,9,11};
        return sample;
    }

    public static int[] generateSample4()
    {
        int [] sample = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
        return sample;
    }

    @Test
    void finds_all_even_numbers_set2()
    {
        ValueFilter filter = new ValueFilter();

        int [] sample = generateSample2();
        int [] evenNums = filter.filterEvenNumbers(sample);

        boolean expected = true;
        boolean actual = allAreEven(evenNums);
        assertEquals(expected,actual);
    }

    @Test
    void finds_all_even_numbers_set3()
    {
        ValueFilter filter = new ValueFilter();

        int [] sample = generateSample3();
        int [] evenNums = filter.filterEvenNumbers(sample);

        boolean expected = true;
        boolean actual = allAreEven(evenNums);
        assertEquals(expected,actual);
    }

    @Test
    void finds_all_even_numbers_set4()
    {
        ValueFilter filter = new ValueFilter();

        int [] sample = generateSample4();
        int [] evenNums = filter.filterEvenNumbers(sample);

        boolean expected = true;
        boolean actual = allAreEven(evenNums);
        assertEquals(expected,actual);
    }

    @Test
    void finds_all_even_numbers_set1()
    {
        ValueFilter filter = new ValueFilter();

        int [] sample = generateSample1();
        int [] evenNums = filter.filterEvenNumbers(sample);

        boolean expected = true;
        boolean actual = allAreEven(evenNums);
        assertEquals(expected,actual);
    }






}