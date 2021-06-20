/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex44;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    public static String productInput;

    @Test
    void matchFoundCorrectly1() {
        JSON j = new JSON();
        List<Product> products = j.convertJsonToArray();
        App.productInput = "Thing";
        assertTrue(App.matchFound(products));
    }
    @Test
    void matchFoundCorrectly2() {
        JSON j = new JSON();
        List<Product> products = j.convertJsonToArray();
        App.productInput = "Doodad";
        assertTrue(App.matchFound(products));
    }
    @Test
    void matchFoundCorrectly3() {
        JSON j = new JSON();
        List<Product> products = j.convertJsonToArray();
        App.productInput = "Widget";
        assertTrue(App.matchFound(products));
    }

}