package com.design.principles.srp.problematic;

// This class violates the Single Responsibility Principle (SRP) because it has multiple responsibilities:
// 1. Displaying employee information
// 2. Calculating salary
// 3. Generating performance reports
public class Employee {

    private int id;

    public void displayInfo(){

    }

    public double calculateSalary(){
        return 0;
    }

    public void performanceReport(){

    }

    public int getId(){
        return this.id;
    }
}
