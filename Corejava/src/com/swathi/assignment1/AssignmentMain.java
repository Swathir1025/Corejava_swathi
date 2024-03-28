package com.swathi.assignment1;
import com.swathi.assignment1.employee.*;
import com.swathi.assignment1.utilities.*;


public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
        manager.setName("John Doe");
        manager.setEmployeeId(1001);
        manager.setSalary(75000);
        manager.setDepartment("Engineering");

       Developer developer = new Developer();
        developer.setName("Alice Smith");
        developer.setEmployeeId(1002);
        developer.setSalary(65000);
        developer.setProgrammingLanguage("Java");

        EmployeeUtilities employeeUtilities = new EmployeeUtilities();
        employeeUtilities.printEmployeeDetails(manager);
        employeeUtilities.printEmployeeDetails(developer);
    }

	}


