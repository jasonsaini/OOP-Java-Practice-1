/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment2.ex30.base;

public class Solution30 {
    public static void main(String args[])
    {
        for(int i = 1; i <= 12; i++)
        {
            for(int j = 1; j <= 12; j++){
                System.out.print(j * i + "\t");
            }
            System.out.print("\n");
        }
    }
}
