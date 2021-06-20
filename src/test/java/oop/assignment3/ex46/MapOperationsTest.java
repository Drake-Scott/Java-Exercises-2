/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex46;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MapOperationsTest {

    @Test
    void getKeyArray() {
        String[] orderedTestArray = {"badger","mushroom","snake"};
        FileOperations fo = new FileOperations();
        List<String> words = fo.getList();

        HashMap<String, Integer> wordCount;

        wordCount = MapOperations.getMap(words);
        wordCount = MapOperations.sortMap(wordCount);

        String[] keys = MapOperations.getKeyArray(wordCount);


        assertArrayEquals(keys, orderedTestArray);

    }
}