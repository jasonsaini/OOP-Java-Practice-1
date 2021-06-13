/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package assignment2.ex38.base;

import java.util.Scanner;
import java.util.Arrays;

public class ValueFilter {
    private static Scanner in = new Scanner(System.in);
    public static int[] promptValues()
    {
        String input;
        System.out.print("Enter a list of numbers, separated by spaces: ");
        input = in.nextLine();
        String [] buffer = input.split(" ");

        int [] values = new int[buffer.length];

        for(int i = 0; i < buffer.length; i++)
        {
            values[i] = Integer.parseInt(buffer[i]);
        }
        return values;
    }

    public static int [] filterEvenNumbers(int [] oldVals)
    {
        int [] bufferValues = new int[oldVals.length];
        int evenCount = 0;
        for(int i = 0; i < oldVals.length; i++)
        {
            if(oldVals[i] % 2 == 0 && oldVals[i] != 0)
            {
                evenCount++;
            }
        }

        int [] newVals = new int[evenCount];
        for(int i = 0; i < oldVals.length; i++)
        {
            if (oldVals[i] % 2 == 0 && oldVals[i] != 0)
            {
                int j = 0;
                while(newVals[j] != 0)
                {
                    j++;
                }
                newVals[j] = oldVals[i];
            }
        }
        return newVals;
    }


}
