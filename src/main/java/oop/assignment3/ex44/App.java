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
    public static int count = 0;

    public static void main(String[] args) {

        //use JSON class to convert Json input file to array of products.
        JSON j = new JSON();
        List<Product> products = j.convertJsonToArray();

        readUserInput();
        int iter = 0;
        while(iter == 0) {
            if (matchFound(products)) {
                for (Product element : products) {
                    if ((element.getName()).equals(productInput)) {
                        System.out.println("Name: " + element.getName());
                        System.out.println("Price: " + element.getPrice());
                        System.out.println("Quantity: " + element.getQuantity());
                        iter++;
                    }
                }
            }
            else{
                System.out.println("Sorry, that product was not found in our inventory.");
                readUserInput();
            }
        }

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

}
