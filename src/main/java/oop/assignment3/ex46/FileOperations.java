/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex46;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperations {

    public static List<String> getList(){

        //initialize new list of words
        List<String> wordList = new ArrayList<>();
        //define the path of the input file.
        String path = "src/main/resources/exercise46_input.txt";

        try{
            Scanner s = new Scanner(new File(path));
            while(s.hasNext()){
                wordList.add(s.next());
            }
            s.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return wordList;
    }

}
