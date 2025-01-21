// Define the Client class
class Client {
    private double basePay;
    private int hoursWorked;

    // Parameterized constructor
    public Client(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }

    // Default constructor
    public Client() {
        this.basePay = 8.00; // Minimum wage
        this.hoursWorked = 0;
    }

    // Method to compute salary
    public void computeSalary() {
        // Check for errors
        if (basePay < 8.00) {
            System.out.println("Error: Base pay must be at least $8.00 per hour.");
            return;
        }
        if (hoursWorked > 60) {
            System.out.println("Error: Employee cannot work more than 60 hours in a week.");
            return;
        }

        double totalPay = 0;

        // Compute the total pay based on hours worked and base pay
        if (hoursWorked <= 40) {
            totalPay = basePay * hoursWorked; // Regular pay
        } else {
            // Regular pay for the first 40 hours
            totalPay = basePay * 40;
            // Overtime pay for hours worked beyond 40
            totalPay += (hoursWorked - 40) * basePay * 1.5;
        }

        // Print the total salary
        System.out.printf("Total Pay: $%.2f\n", totalPay);
    }
}

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        // Create Employee objects with given data
        Client employee1 = new Client(7.50, 35); // Employee 1
        Client employee2 = new Client(8.20, 47); // Employee 2
        Client employee3 = new Client(10.00, 3); // Employee 3

        // Call computeSalary method for each employee
        System.out.println("Employee 1:");
        employee1.computeSalary();

        System.out.println("\nEmployee 2:");
        employee2.computeSalary();

        System.out.println("\nEmployee 3:");
        employee3.computeSalary();
    }
}
