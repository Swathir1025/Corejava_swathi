package com.swathi.assignment1.employee;

import com.swathi.assignment1.Employee;

public class Developer extends Employee {
    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}