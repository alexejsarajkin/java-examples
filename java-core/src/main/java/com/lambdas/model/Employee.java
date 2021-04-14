package com.lambdas.model;

public class Employee {
    public static int id;
    private int employeeId;
    private String name;
    private String position;
    private int salary;
    private String department;

    static {
        id = 1;
        System.out.println("Static init block code");
    }

    {
        department = "IT";
        System.out.println("Non static init block code");
    }

    public Employee() {
        this("A", "B", 1);
        System.out.println("Empty constructor called");
    }

    public Employee(String name, String position, int salary) {
        this(name, position, salary, "IT");
        System.out.println("Constructor with 3 params called");
    }

    public Employee(String name, String position, int salary, String department) {
        this.employeeId = id++;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.department = department;
        System.out.println("Constructor with 4 params called");
    }

    public int getId() {
        return id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        Employee.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
