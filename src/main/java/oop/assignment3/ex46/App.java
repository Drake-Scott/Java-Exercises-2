/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex46;

import java.util.*;


public class App {
    public static void main(String[] args) {

        FileOperations fo = new FileOperations();
        MapOperations mo = new MapOperations();

        //Get list of words from file input.
        List<String> words = fo.getList();

        //initialize a new hashmap for wordcount with parameters <String, Integer>
        HashMap<String, Integer> wordCount;

        //Fill and sort the LinkedHashMap
        wordCount = mo.getMap(words);
        wordCount = mo.sortMap(wordCount);


        String[] keys = mo.getKeyArray(wordCount);
        mo.printMap(wordCount, keys);

    }
}
