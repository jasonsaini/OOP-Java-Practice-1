/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment2.ex33.base;

public class Solution33 {
    public static void main(String args[])
    {
        System.out.println("Ask the Magic 8 ball a question! ");
        Magic8Ball ball = new Magic8Ball();
        String output = ball.generateRandomAnswer();
        System.out.print(output);
    }

}
