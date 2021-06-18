/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex41;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class FileOperations {

    //function to create an array list of names.
    public static List getListOfNames(){

        //initialize new ArrayList
        ArrayList<String> names = new ArrayList<>();


        try (Scanner sc = new Scanner(new File("src/main/resources/exercise41_input.txt"))){

            //read each name and add the String to the ArrayList.
            while(sc.hasNext()){
                names.add(sc.nextLine());
            }
        } catch (Exception e) {
            e.getStackTrace();
        }

        return names;

    }

}
