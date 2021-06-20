/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex44;

import com.google.gson.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JSON {

    public static Gson gson = new Gson();

    public static List<Product> convertJsonToArray() {

        //create new file from path.
        String filePath = "src/main/resources/exercise44_input.json";
        File input = new File(filePath);

        //Create array list for products from Json file.
        List<Product> productsList = new ArrayList<>();

        try {
            //User Gson to parse elements into Product object.
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject fileObject = fileElement.getAsJsonObject();

            //Extract the data from Json file to appropriate data types.
            JsonArray arrayOfProducts = fileObject.get("products").getAsJsonArray();

            //Iterate through each element of the Json file.
            for (JsonElement productElement : arrayOfProducts){

                //Creaste Json Object using Gson
                JsonObject productJsonObject = productElement.getAsJsonObject();

                //For each element of the Json file, get the name, price, and quantity.
                String name = productJsonObject.get("name").getAsString();
                double price = productJsonObject.get("price").getAsDouble();
                int quantity = productJsonObject.get("quantity").getAsInt();

                //create a new product with the previous information and add it to the list
                Product product = new Product(name, price, quantity);
                productsList.add(product);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return productsList;
    }

}
