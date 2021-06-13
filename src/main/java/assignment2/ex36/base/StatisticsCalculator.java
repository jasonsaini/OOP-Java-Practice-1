/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package assignment2.ex36.base;

import java.util.ArrayList;
import java.util.Scanner;

public class StatisticsCalculator {
    private static Scanner in = new Scanner(System.in);

    public static ArrayList<Integer> getNumbers()
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        String buffer;
        do
        {
            System.out.print("Enter a number: ");
            buffer = in.nextLine();
            if(buffer.equals("done"))
            {
                break;
            }
            else
            {
                try {
                    int cur_num = Integer.parseInt(buffer);
                    nums.add(cur_num);
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Please enter numeric data or \"done\" if done");
                    continue;
                }
            }
        }
        while(!buffer.equals("done"));

        return nums;
    }

    public static double average(ArrayList<Integer> numbers)
    {
        int numCount = numbers.size();
        double sum = 0;
        for(int i = 0; i < numCount; i++)
        {
            sum += numbers.get(i);
        }
        return sum/numCount;
    }

    public static double max(ArrayList<Integer> numbers)
    {
        int numCount = numbers.size(), max = Integer.MIN_VALUE;
        for(int i = 0; i < numCount; i++)
        {
            if(max < numbers.get(i)){
                max = numbers.get(i);
            }

        }
        return max;
    }

    public static double min(ArrayList<Integer> numbers)
    {
        int numCount = numbers.size(), min = Integer.MAX_VALUE;
        for(int i =0; i < numCount; i++)
        {
            if(numbers.get(i) < min)
            {
                min = numbers.get(i);
            }
        }
        return min;
    }

    public static double std(ArrayList<Integer> numbers) {
        double sum = 0, standardDeviation = 0;
        int length = numbers.size();

        for (int i = 0; i < length; i++) {
            sum += numbers.get(i);
        }

        double mean = sum / length;

        for (int i = 0; i < length; i++) {
            standardDeviation += Math.pow(numbers.get(i) - mean, 2);
        }

        return Math.sqrt(standardDeviation / length);
    }
}
