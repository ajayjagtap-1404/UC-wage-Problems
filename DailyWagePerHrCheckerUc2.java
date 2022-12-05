package com.bridgelabz.day3employeewageproblem;

public class DailyWagePerHrCheckerUc2 {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage program");

        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int WAGE_PER_HOUR = 20;
        int empHrs;
        // Random Check
        double empCheck = Math.floor(Math.random()*10) % 3;

         if (empCheck == IS_FULL_TIME) {
             System.out.println("Employee is Present Full time");
             empHrs = 8;

         }else if (empCheck == IS_PART_TIME) {
             System.out.println("Employee is present Half time");
             empHrs = 0;
         }else {
             System.out.println("Employee is Absent");
             empHrs =0;
         }


              int dailyWage = (empHrs * WAGE_PER_HOUR);
              System.out.println("Daily Employee wage: "+ dailyWage);


         }

    }

