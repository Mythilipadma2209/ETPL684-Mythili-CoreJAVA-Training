package com.evergent.CoreJAVA.CaseStudy3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Main Class
public class EmployeeManagementSystem {
	 // Employee class definition
    public static class Employee {
        private int id;
        private String name;
        private String department;

        // Constructor
        public Employee(int id, String name, String department) {
            this.id = id;
            this.name = name;
            this.department = department;
        }

        // Getters and Setters
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getDepartment() { return department; }
        public void setDepartment(String department) { this.department = department; }

        @Override
        public String toString() {
            return "Employee{id=" + id + ", name='" + name + "', department='" + department + "'}";
        }
    }

    private HashMap<Integer, Employee> employeeMap;
    private Scanner scanner;

    // Constructor
    public EmployeeManagementSystem() {
        employeeMap = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    // Add new employee
    public void addEmployee() {
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee department: ");
        String department = scanner.nextLine();

        Employee employee = new Employee(id, name, department);
        employeeMap.put(id, employee);
        System.out.println("Employee added successfully.");
    }

    // Retrieve employee details
    public void getEmployee() {
        System.out.print("Enter employee ID to retrieve: ");
        int id = scanner.nextInt();
        Employee employee = employeeMap.get(id);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    // Update employee information
    public void updateEmployee() {
        System.out.print("Enter employee ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (employeeMap.containsKey(id)) {
            System.out.print("Enter new employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new employee department: ");
            String department = scanner.nextLine();

            Employee employee = new Employee(id, name, department);
            employeeMap.put(id, employee);
            System.out.println("Employee updated successfully.");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    // Remove employee
    public void removeEmployee() {
        System.out.print("Enter employee ID to remove: ");
        int id = scanner.nextInt();
        if (employeeMap.remove(id) != null) {
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    // List all employees
    public void listAllEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
    }

    // Main loop for user interface
    public void run() {
        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Retrieve Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. List All Employees");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    getEmployee();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    removeEmployee();
                    break;
                case 5:
                    listAllEmployees();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        ems.run();
    }

}
