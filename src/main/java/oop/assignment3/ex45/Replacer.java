/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex45;

public class Replacer {

    //Function using the replace.All method to replace any instance of undesired words.
    public static String replaceInstances(String regex){
        regex = regex.replaceAll("utilize","use");
        regex = regex.replaceAll("utilizes","uses");
        return regex;
    }
}
