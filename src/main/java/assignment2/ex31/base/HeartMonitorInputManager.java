/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment2.ex31.base;

import java.util.Scanner;

public class HeartMonitorInputManager{
    private static Scanner in = new Scanner(System.in);

    public static int getInput(String data)
    {
        double val = 0;
        while (val == 0)
        {
            try
            {
                System.out.print("Enter your " + data + ": ");
                val = in.nextInt();
            }
            catch (Exception e)
            {
                in.nextLine();
                System.out.println("Enter a valid input!\n");
                continue;
            }
        }
        return (int)Math.ceil(val);
    }


    public static int calculateTargetHeartRate(int age, double restingPulse, double intensity)
    {
        intensity /= 100;
        double targetHeartRate = 220-age;
        targetHeartRate -= restingPulse;
        targetHeartRate *= intensity;
        targetHeartRate += restingPulse;
        return (int)Math.rint(targetHeartRate);
    }



}
