package com.constructors;

import com.lambdas.model.Employee;

public class ConstructorsMain {

    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee employee1 = new Employee("Alex", "Developer", 100);
        Employee employee2 = new Employee("John", "Developer", 100);

        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);

    }
}
