/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex45;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperations {

    public static String copyInput(){

        //create new file from path.
        String filePath = "src/main/resources/exercise45_input.txt";
        String content = "";
        try {
            content = Files.readString(Paths.get(filePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content;
    }

    //function to write the new output data to the desired location
    public static void writeOutput(String outputPath, String outputData){
        try (PrintWriter out = new PrintWriter(outputPath)) {
            out.println(outputData);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
