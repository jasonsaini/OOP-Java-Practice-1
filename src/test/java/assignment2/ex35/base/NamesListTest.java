/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package assignment2.ex35.base;

import org.junit.jupiter.api.Test;

import javax.naming.Name;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NamesListTest {

    public static ArrayList<String> generateSampleList()
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Homer");
        names.add("Bart");
        names.add("Maggie");
        names.add("Lisa");
        names.add("Moe");
        return names;
    }


    @Test
    void returns_name_in_list_set1()
    {
        NamesList list = new NamesList();
        ArrayList<String> names = generateSampleList();

        String returnedName = NamesList.generateWinningName(names);
        Boolean expected = true;
        Boolean actual = names.contains(returnedName);
        assertEquals(expected,actual);
    }

    @Test
    void returns_name_in_list_set2()
    {
        NamesList list = new NamesList();
        ArrayList<String> names = generateSampleList();

        String returnedName = NamesList.generateWinningName(names);
        Boolean expected = true;
        Boolean actual = names.contains(returnedName);
        assertEquals(expected,actual);
    }

    @Test
    void returns_name_in_list_set3()
    {
        NamesList list = new NamesList();
        ArrayList<String> names = generateSampleList();

        String returnedName = NamesList.generateWinningName(names);
        Boolean expected = true;
        Boolean actual = names.contains(returnedName);
        assertEquals(expected,actual);
    }

    @Test
    void returns_name_in_list_set4()
    {
        NamesList list = new NamesList();
        ArrayList<String> names = generateSampleList();

        String returnedName = NamesList.generateWinningName(names);
        Boolean expected = true;
        Boolean actual = names.contains(returnedName);
        assertEquals(expected,actual);
    }

    @Test
    void returns_name_in_list_set5()
    {
        NamesList list = new NamesList();
        ArrayList<String> names = generateSampleList();

        String returnedName = NamesList.generateWinningName(names);
        Boolean expected = true;
        Boolean actual = names.contains(returnedName);
        assertEquals(expected,actual);
    }

}