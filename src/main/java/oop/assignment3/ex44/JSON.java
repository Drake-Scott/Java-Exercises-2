/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex44;

import com.google.gson.Gson;

import java.nio.file.Files;
import java.nio.file.Paths;

public class JSON {

    public static Gson gson = new Gson();

    public static Product[] convertJsonToArray() {

        String filePath = "src/main/resources/exercise44_input.json";
        String jsonString = readAllBytes(filePath);

        Product[] products = new Gson().fromJson(jsonString, Product[].class);

        return products;
    }

    private static String readAllBytes(String filePath){
        String data = "";

        try{
            data = new String(Files.readAllBytes(Paths.get(filePath)));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return data;
    }

}
