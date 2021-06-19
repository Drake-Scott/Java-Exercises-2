/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex43;

import java.util.Scanner;

public class App {

    //public static variables for user's input.
    public static String siteName, author, js, css;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //read user input and get user's choices
        readUserInput();

        //create the directories depending on user input.
        DirectoryCreator dc = new DirectoryCreator();
        dc.createDirectories(siteName, author, js, css);

    }

    //Prompt user for input and store in static variables.
    public static void readUserInput(){

        System.out.print("Site name: ");
        siteName = input.nextLine();

        System.out.print("Author: ");
        author = input.nextLine();

        System.out.print("Do you want a folder for JavaScript? ");
        js = input.nextLine();

        System.out.print("Do you want a folder for CSS? ");
        css = input.nextLine();

    }


}
