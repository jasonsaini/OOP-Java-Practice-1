/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment2.ex32.base;

public class Solution32 {
    public static void main(String args[]) {
        GuessingGame game = new GuessingGame();
        int difficultyLevel, randomNumber, answer, guess = -1;

        String checkGuess;

        boolean playing = true;
        while (playing) {
            System.out.println("Let's play Guess the Number!");
            System.out.println("\nEnter the difficulty level (1, 2, or 3): ");
            difficultyLevel = game.getDifficulty();
            randomNumber = game.generateRandomNumber(difficultyLevel);
            System.out.print("I have my number. What's your guess? ");
            guess = game.getGuess();
            int numGuesses = 1;
            while(!game.checkGuess(guess,randomNumber).equals("You got it "))
            {
                System.out.print(game.checkGuess(guess, randomNumber));
                guess = game.getGuess();
                numGuesses++;
            }
            System.out.print(game.checkGuess(guess, randomNumber) + "in " + numGuesses + " tries!");

            System.out.print("Do you want to play again? (y/n) ");
            char choice = game.getChoice();

            if(choice == 'n')
            {
                playing = false;
            }
        }

    }
}
