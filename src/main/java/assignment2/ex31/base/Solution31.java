/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment2.ex31.base;

import java.util.Scanner;

public class Solution31 {
    public static void main(String args[])
    {
        HeartMonitorInputManager inputManager = new HeartMonitorInputManager();
        int age = inputManager.getInput("age");
        int restingPulse = inputManager.getInput("resting heart rate");
        int currentIntensity = 55;

        System.out.println("Resting Pulse: " + restingPulse + "\t\t\tAge: " + age);
        System.out.println("Intensity\t| Rate");
        System.out.println("----------------------");

        while (currentIntensity <= 95)
        {
            System.out.printf("%d%%\t\t\t| %d bpm\n", currentIntensity, inputManager.calculateTargetHeartRate(age,restingPulse,currentIntensity));
            currentIntensity += 5;
        }


    }

}

