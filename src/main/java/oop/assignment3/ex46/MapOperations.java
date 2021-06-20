/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex46;

import java.util.*;

public class MapOperations {

    public static HashMap<String, Integer> getMap(List<String> words){
        Map<String, Integer> wordCount = new HashMap<String, Integer>();

        //iterate through the words of the list.
        for(String word: words) {
            Integer count = wordCount.get(word);
            //if there is no instance of the word, put 1. else add 1 to the existing count.
            wordCount.put(word, (count==null) ? 1 : count+1);
        }
        return (HashMap<String, Integer>) wordCount;
    }

    public static LinkedHashMap<String, Integer> sortMap(HashMap<String, Integer> map){

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();

        //Using comparator, we can sort the LinkedHashMap by descending values.
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        return sortedMap;
    }

    public static String[] getKeyArray(HashMap<String, Integer> sortedMap){
        //Function to get an array of all the keys to the map in order.
        String[] keys = sortedMap.keySet().toArray(new String[0]);
        return keys;
    }

    public static void printMap(HashMap<String, Integer> sortedMap, String[] keys){
        String star = "*";
        for(int i = 0; i < keys.length; i++){
            System.out.printf("%-10s: ",keys[i]);
            for(int j = 0; j < sortedMap.get(keys[i]); j++){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
