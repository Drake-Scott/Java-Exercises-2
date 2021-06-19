/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex43;

import java.io.*;

public class DirectoryCreator {

    public static HTML html = new HTML();

    public static void createDirectories(String siteName, String author, String js, String css){

        //convert js and css user input to lowercase for ease of use.
        js.toLowerCase();
        css.toLowerCase();

        //create the required initial directory with index.html.
        createInitial(siteName);
        html.createHTMLIndex(siteName, author);

        //depending on user input, create the javascript and css directories.
        if(js.equals("y")){
            createJS(siteName);
        }

        if(css.equals("y")){
            createCSS(siteName);
        }

    }

    public static void createInitial(String siteName) {

        //create new folder directory for website in the directories folder in repo.
        String directory = "Ex43_Directories/" + siteName;
        File f = new File(directory);
        f.mkdirs();

        //print successful creation to console.
        System.out.println("Created ./" + directory);

    }

    public static void createJS(String siteName){

        //function creates new directory for JavaScript
        String directory = "Ex43_Directories/" + siteName + "/js";
        File fjs = new File(directory);
        fjs.mkdirs();

        //print successful creation to console.
        System.out.println("Created ./" + directory);

    }

    public static void createCSS(String siteName){

        //function creates new directory for CSS
        String directory = "Ex43_Directories/" + siteName + "/css";
        File fcss = new File(directory);
        fcss.mkdirs();

        //print successful creation to console.
        System.out.println("Created ./" + directory);

    }


}
