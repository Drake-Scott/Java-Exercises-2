/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex43;

import java.io.BufferedWriter;
import java.io.*;

public class HTML {

    public static void createHTMLIndex(String siteName, String author){

        //Create the index.html file at desired directory
        String directory = "Ex43_Directories/" + siteName + "/index.html";
        File file = new File(directory);

        //declare the information that will go into the html file.
        String html = "<title>" + siteName + "</title>\n<meta>" + author + "</meta>";

        //write the information to the file.
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(html);
            bw.close();

            //print successful creation to console.
            System.out.println("Created ./" + directory);
        }
        catch(Exception e){
            System.out.println("Unable to create index.html");
            return;
        }

    }
}
