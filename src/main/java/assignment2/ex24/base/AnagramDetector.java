/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment2.ex24.base;
import java.util.Arrays;

public class AnagramDetector {
    public static boolean isAnagram(String s1, String s2)
    {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        if (arr1.length != arr2.length)
        {
            return false;
        }
        else
        {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for(int i = 0; i < arr1.length; i++)
            {
                if(arr1[i] != arr2[i])
                {
                    return false;
                }
            }
        }
        return true;
    }

}
