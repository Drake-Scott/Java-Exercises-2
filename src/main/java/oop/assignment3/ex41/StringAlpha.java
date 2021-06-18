/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex41;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

public class StringAlpha {

    //function to alphabetize the array list of names.
    public static List alphabetizeList(List namesPreSorting){

        //sort names using collections.sort
        Collections.sort(namesPreSorting, String.CASE_INSENSITIVE_ORDER);
        return namesPreSorting;

    }

    //function to print the formatted list.
    public static void printFormattedList(List names) throws IOException {

        //create a new PrintWriter for the output file.
        PrintWriter out = new PrintWriter("exercise41_output.txt");

        //print out the header of the file, which includes the number of names.
        out.println("Total of " + names.size() + " names");
        out.println("-----------------");

        //print out each element of the array list by iterating through each index.
        for(int i = 0 ; i < names.size() ; i++){
            System.out.println(names.get(i));

        }
    }

}
