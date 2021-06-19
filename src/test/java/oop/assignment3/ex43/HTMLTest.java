/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex43;

import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

class HTMLTest {

    public static HTML h = new HTML();

    @Test
    void createHTMLIndexTest() {
        String[] assertions = new String[]{"<title>awesomeco</title>","<meta>Max Power</meta>"};

        try {
            BufferedReader br = new BufferedReader(new FileReader("index.html"));
            String s;
            int i = 0;
            String[] fileData = new String[2];
            while((s = br.readLine()) != null){
                assertEquals(assertions[i] , fileData[i]);
                i++;
            }
        } catch (Exception e) {
            return;
        }
    }
}