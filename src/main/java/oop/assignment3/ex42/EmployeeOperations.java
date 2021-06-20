package oop.assignment3.ex42;

import java.util.List;

public class EmployeeOperations {

    public static void printList(List<Employees> employeesList){

        //for each employee, get and print every aspect of their object.
        for(Employees each : employeesList){
            System.out.printf("%-12s%-12s%.2f", each.getLname(), each.getFname(), each.getSalary());
            System.out.println();
        }

    }

}
