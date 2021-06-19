/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment3.ex42;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static EmployeeOperations eo = new EmployeeOperations();
    public static FileOperations fo = new FileOperations();

    public static void main(String[] args) {

        //read data from the file and create a list of employees.
        List<Employees> employeeList = fo.getData();

        //print out header.
        System.out.println("Last\t\tFirst\t\tSalary");
        System.out.println("------------------------------");
        eo.printList(employeeList);


    }
}
