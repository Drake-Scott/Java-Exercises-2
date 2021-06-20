/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex44;

import java.util.List;
import java.util.Scanner;

public class App {

    public static Scanner input = new Scanner(System.in);
    public static String productInput;

    public static void main(String[] args) {

        //use JSON class to convert Json input file to array of products.
        JSON j = new JSON();
        List<Product> products = j.convertJsonToArray();

        //read user input, and loop until a match is found
        readUserInput();
        iterativeLoop(products);

    }

    public static void readUserInput() {
        System.out.print("What is the product name? ");
        productInput = input.next();
    }

    //Function to find out if the product input exists within the list of products.
    public static boolean matchFound(List<Product> products){
        for (Product element : products){
            //If any of the products equals the input, return true, else return false.
            if((element.getName()).equals(productInput)){
                return true;
            }
        }
        return false;
    }

    public static void iterativeLoop(List<Product> products){
        //while loop continues indefinitely until correct product is entered.
        int iter = 0;
        while(iter == 0) {
            //If a match is found with the products and product input
            if (matchFound(products)) {
                //iterate through the products and print the info for the correct one.
                for (Product element : products) {
                    if ((element.getName()).equals(productInput)) {
                        System.out.println("Name: " + element.getName());
                        System.out.println("Price: " + element.getPrice());
                        System.out.println("Quantity: " + element.getQuantity());
                        //increment the iterator to stop the while loops
                        iter++;
                    }
                }
            }
            //if no match is found, print out sorry and ask for user input again. While loop continues.
            else{
                System.out.println("Sorry, that product was not found in our inventory.");
                readUserInput();
            }
        }
    }

}
