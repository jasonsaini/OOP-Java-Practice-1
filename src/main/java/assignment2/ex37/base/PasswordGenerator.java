/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package assignment2.ex37.base;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.stream.IntStream;

public class PasswordGenerator {
    public static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    public static char[] specialChars = "!@#$%^&*()+~`".toCharArray();
    public static char[] numbers = "0123456789".toCharArray();

    public static char[] generatePassword(int minLength, int numSpecialChars, int numCount)
    {


        int [] usedIndeces = new int[minLength];
        char[] password =  new char[minLength];
        for(int i = 0; i < password.length; i++)
        {
            password[i] = ' ';
        }
        for(int j = 0; j < numSpecialChars; j++)
        {
            int cur_special_char_index_to = generateRandomIndex(minLength - 1, usedIndeces);
            int cur_special_char_index_from = generateRandomIndex(specialChars.length - 1, usedIndeces);

            int trackUsed = 0;
            while(usedIndeces[trackUsed] != ' ' && trackUsed < usedIndeces.length - 1)
            {
                trackUsed++;
            }
            usedIndeces[trackUsed] = cur_special_char_index_to;

            password[cur_special_char_index_to] = specialChars[cur_special_char_index_from];
        }
        for(int k = 0; k < numCount; k++)
        {
            int cur_int_index_to = generateRandomIndex(minLength-1,usedIndeces);
            int cur_int_index_from = generateRandomIndex(numbers.length - 1,usedIndeces);

            int trackUsed = 0;
            while(usedIndeces[trackUsed] != ' ' && trackUsed < usedIndeces.length -1)
            {
                trackUsed++;
            }
            usedIndeces[trackUsed] = cur_int_index_to;
            password[cur_int_index_to] = numbers[cur_int_index_from];
        }
        for(int z = 0; z < password.length; z++)
        {
            if(password[z] == ' ') {
                int curIndex = generateRandomIndex(minLength, usedIndeces);
                password[z] = alphabet[curIndex];
            }
        }
        return password;
    }

    public static boolean isUsedIndex(int potentialIndex, int[] usedIndeces)
    {
        for(int i = 0; i < usedIndeces.length; i++)
        {
            if(potentialIndex == usedIndeces[i])
            {
                return true;
            }
        }
        return false;
    }

    public static int generateRandomIndex(int minLength, int[] usedIndeces)
    {
        int cur_index;
        do {
            cur_index = ThreadLocalRandom.current().nextInt(0, minLength - 1);
        }
        while(isUsedIndex(cur_index, usedIndeces));
        return cur_index;
    }


}
