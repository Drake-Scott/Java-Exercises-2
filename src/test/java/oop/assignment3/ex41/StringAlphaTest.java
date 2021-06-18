/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex41;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StringAlphaTest{

    private static StringAlpha alpha = new StringAlpha();

    @Test
    void testAlphabetizeList() {

        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo = new ArrayList<>();

        listOne.add("bbb, man");
        listOne.add("aaay");
        listOne.add("eeey");
        listOne.add("AAy");

        listTwo.add("aaay");
        listTwo.add("AAy");
        listTwo.add("bbb, man");
        listTwo.add("eeey");



        listOne = (ArrayList<String>) alpha.alphabetizeList(listOne);

        assertEquals(listOne, listTwo);
    }
}