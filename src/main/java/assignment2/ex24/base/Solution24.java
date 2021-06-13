/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment2.ex24.base;
import java.util.Scanner;


public class Solution24 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String args[])
    {
        String s1, s2, not = "";
        AnagramDetector detector = new AnagramDetector();

        System.out.println("Enter two strings and I'll tell you if they're anagrams: ");

        System.out.print("Enter the first string: ");
        s1 = in.nextLine();
        System.out.print("Enter the second string: ");
        s2 = in.nextLine();

        if(!detector.isAnagram(s1,s2))
        {
            not = "not";
        }

        System.out.println("\"" + s1 + " and \"" + s2 + "\" are " + not + "anagrams.");
    }
}
