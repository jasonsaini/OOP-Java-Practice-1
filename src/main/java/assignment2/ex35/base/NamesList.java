/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package assignment2.ex35.base;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class NamesList {
    private static Scanner in = new Scanner(System.in);

    public static ArrayList<String> generateNamesList()
    {
        ArrayList<String> names = new ArrayList<String>();
        String cur_name;
        do{
            System.out.print("Enter a name: ");
            cur_name = in.nextLine();
            names.add(cur_name);
        }
        while(!cur_name.trim().isEmpty());
        return names;
    }

    public static String generateWinningName(ArrayList<String> names)
    {
        int max = names.size();
        int randIndex = ThreadLocalRandom.current().nextInt(0, max);
        return names.get(randIndex);
    }


}
