package com.design.principles.srp.optimal;

// This class represents an Employee with a unique ID.
// It adheres to the Single Responsibility Principle (SRP) by focusing solely on the employee's ID.
// The Employee class is responsible for managing the employee's ID.
// It does not handle any other responsibilities such as displaying information, calculating salary, or generating reports.
public class Employee {

    private final int id;

    public Employee(int id){
        this.id = id;
    }
}
