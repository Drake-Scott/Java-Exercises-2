/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex42;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {

    //create a list for the employees
    public static List<Employees> employeeList = new ArrayList<>();

    //function to get data from file and transform it into workable info.
    public static List<Employees> getData(){
        try{

            //using a buffered reader and file reader to get data.
            BufferedReader br = new BufferedReader(
                    new FileReader("src/main/resources/exercise42_input.txt"));
            String s;

            //iterate while loop until you reach the end of the file.
            while((s = br.readLine()) != null){

                //load a string array with the data, with a comma separating info.
                String[] data = s.split(",");
                //parse data into variables.
                parseData(data);

            }
            //close the file reader and return the new list of employees.
            br.close();
            return employeeList;
        }
        catch(Exception ex){
            return null;
        }
    }

    public static void parseData(String[] data){

        //create 3 variables for the employees name and salary.
        String lname = data[0];
        String fname = data[1];
        float salary = Float.parseFloat(data[2]);

        //create a new object to add to the list.
        Employees employeeObj = new Employees(lname, fname, salary);
        employeeList.add(employeeObj);

    }

}
