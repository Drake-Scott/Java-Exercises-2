/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex46;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    public static String[] animals = new String[] {"snake","snake","snake","mushroom","mushroom","badger","random",};

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
}