/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package assignment2.ex36.base;

import java.util.ArrayList;

public class Solution36 {
    public static void main(String args[])
    {
        StatisticsCalculator calculator = new StatisticsCalculator();
        ArrayList<Integer> numbers = calculator.getNumbers();

        double average = calculator.average(numbers);
        double max = calculator.max(numbers);
        double min = calculator.min(numbers);
        double standardDeviation = calculator.std(numbers);

        System.out.print("Numbers: ");
        char comma = ',';
        for(int i = 0; i < numbers.size(); i++)
        {   if(i == numbers.size() - 1)
            {
                comma = ' ';
            }
            System.out.printf("%d%c ", numbers.get(i), comma);
        }
        System.out.println();

        System.out.printf("The average is %.2f.\n", average);
        System.out.printf("The minimum is %d\n", (int)min);
        System.out.printf("The maximum is %d\n", (int)max);
        System.out.printf("The standard deviation is %.2f\n", standardDeviation);
    }

}
