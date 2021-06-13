/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment2.ex33.base;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Magic8Ball {
    private static Scanner in = new Scanner(System.in);
    private static String[] answers = {"Yes", "No", "Maybe", "Ask again later"};

    public static int generateRandIndex()
    {
        return ThreadLocalRandom.current().nextInt(0, 4);
    }

    public static String generateRandomAnswer()
    {
        in.nextLine();
        int index = generateRandIndex();
        return answers[index];
    }

}
