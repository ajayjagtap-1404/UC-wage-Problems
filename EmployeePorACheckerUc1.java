package com.bridgelabz.day3employeewageproblem;

public class EmployeePorACheckerUc1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Program");

        // initializing variable for present
        int IS_PRESENT = 1;
        // random check

            double empCheck = Math.floor(Math.random() * 10) % 2;

            if (empCheck == IS_PRESENT) {
                System.out.println("Employee is Present");
            } else {
                System.out.println("Employee is Absent");
            }

    }
}
