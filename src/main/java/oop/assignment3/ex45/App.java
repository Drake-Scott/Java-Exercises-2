/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex45;

import java.io.File;
import java.util.Scanner;

public class App {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        FileOperations fo = new FileOperations();
        Replacer r = new Replacer();

        //Ask user for name of output file.
        String outputName = getUserInput();

        //Create a path using this name
        String outputPath = outputName + ".txt";

        //get data from file
        String inputData = fo.copyInput();

        //replace all instances of undesired words
        String outputData = r.replaceInstances(inputData);

        //print new string to desired file location.
        fo.writeOutput(outputPath, outputData);


    }

    public static String getUserInput(){
        System.out.print("What should the output file be called?");
        String outputName = input.next();
        return outputName;
    }

}
