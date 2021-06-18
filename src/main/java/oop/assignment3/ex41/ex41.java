/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex41;

import java.io.IOException;
import java.util.ArrayList;

public class ex41 {

    public static FileOperations f = new FileOperations();
    public static StringAlpha alpha = new StringAlpha();

    public static void main(String[] args) throws IOException {

        //create an array list of strings from reading the input file.
        ArrayList<String> names = (ArrayList<String>) f.getListOfNames();

        //sort the array list alphabetically
        names = (ArrayList<String>) alpha.alphabetizeList(names);

        //print out the formatted list.
        alpha.printFormattedList(names);

    }
}
