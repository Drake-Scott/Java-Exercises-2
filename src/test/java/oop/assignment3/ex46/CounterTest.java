/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex46;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    public static String[] animals = new String[] {"snake","snake","snake","mushroom","mushroom","badger","random",};
    public static List<String> myList = new ArrayList<>();


    @Test
    void countBadger() {
        int count = Counter.countBadger(animals);
        assertEquals(1, count);
    }

    @Test
    void countMushroom() {
        int count = Counter.countMushroom(animals);
        assertEquals(2, count);
    }

    @Test
    void countSnake() {
        int count = Counter.countSnake(animals);
        assertEquals(3, count);
    }

    @Test
    void genericCount1(){
        myList.add("badger");
        int count = Counter.genericCounter(myList, "badger");
        assertEquals(1, count);
    }

    @Test
    void genericCount2(){
        myList.add("mushroom");
        myList.add("mushroom");
        int count = Counter.genericCounter(myList, "mushroom");
        assertEquals(2, count);
    }

    @Test
    void genericCount3(){
        myList.add("snake");
        myList.add("snake");
        myList.add("snake");
        int count = Counter.genericCounter(myList, "snake");
        assertEquals(3, count);
    }
}