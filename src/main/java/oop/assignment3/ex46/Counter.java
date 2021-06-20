/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex46;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Counter {

    //Function to count the amount of times "badger" appears.
    public static int countBadger(String[] animals){
        //initialize count at 0.
        int badgerCount = 0;
        //go through the entire array, increment the count if badger appears.
        for(int i = 0; i < animals.length; i++){
            if(animals[i].equals("badger")){
                badgerCount++;
            }
        }
        return badgerCount;
    }

    //Function to count the amount of times "mushroom" appears.
    public static int countMushroom(String[] animals){
        int mushroomCount = 0;
        //go through the entire array, increment the count if mushroom appears.
        for(int i = 0; i < animals.length; i++){
            if(animals[i].equals("mushroom")){
                mushroomCount++;
            }
        }
        return mushroomCount;
    }

    //Function to count the amount of times "snake" appears.
    public static int countSnake(String[] animals){
        int snakeCount = 0;
        //go through the entire array, increment the count if snake appears.
        for(int i = 0; i < animals.length; i++){
            if(animals[i].equals("snake")){
                snakeCount++;
            }
        }
        return snakeCount;
    }

    public static int genericCounter(List<String> data, String key){
        int count = 0;
        for(int i = 0; i < data.size() ; i++){
            if(data.get(i) == key){
                count++;
            }
        }
        return count;
    }


}
