package com.swathi.assignment1.utilities;

import com.swathi.assignment1.employee.Developer;
import com.swathi.assignment1.employee.Manager;

//import com.swathi.assignment1.employee.Developer;
//import com.swathi.assignment1.employees.Manager;

public class EmployeeUtilities {
	public void printEmployeeDetails(Manager manager) {
        System.out.println("Name: " + manager.getName());
        System.out.println("Employee ID: " + manager.getEmployeeId());
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("Department: " + manager.getDepartment());
    }

    public void printEmployeeDetails(Developer developer) {
        System.out.println("Name: " + developer.getName());
        System.out.println("Employee ID: " + developer.getEmployeeId());
        System.out.println("Salary: " + developer.getSalary());
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}
