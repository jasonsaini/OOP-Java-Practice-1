/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment2.ex32.base;

import java.util.Scanner;

public class GuessingGame {
    private static Scanner in = new Scanner(System.in);

    public static int getDifficulty()
    {
        int difficultyLevel = 0;
        while(!((difficultyLevel >= 1)&&(difficultyLevel<=3)))
        {
            difficultyLevel = in.nextInt();
        }
        return difficultyLevel;
    }

    public static int generateRandomNumber(int difficultyLevel) {
        int range;
        switch (difficultyLevel) {
            case 2:
                range = 101;
                break;
            case 3:
                range = 1001;
                break;
            default:
                range = 11;
        }
        return (int) Math.abs(Math.round(Math.random() * range-1) + 2);
    }

    public static int getGuess()
    {
        int guess = -1;
        while(guess == -1)
        {
            try
            {
                guess = in.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("Please enter numeric inputs only.");
                in.nextLine();
                continue;
            }
        }
        return guess;
    }


    public static String checkGuess(int guess, int randomNumber)
    {
            String returnString = "";
            if(guess < randomNumber){
                returnString = "Too low. Guess again: ";
            }
            else if(guess > randomNumber)
            {
                returnString =  "Too high. Guess again: ";
            }
            else if(guess == randomNumber)
            {
                returnString =  "You got it ";
            }
            return returnString;
    }

    public static char getChoice()
    {
        char choice = in.next().charAt(0);
        while(choice != 'y' && choice != 'n')
        {
            System.out.print("Please enter y/n: ");
            choice = in.next().charAt(0);
            if(choice == 'y' || choice == 'n')
            {
                return choice;
            }
        }
        return 'n';
    }

}