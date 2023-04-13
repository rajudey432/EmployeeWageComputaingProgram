package EmployeeWage;

import java.util.Random;

public class CalculateWagesTillCondition {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int workHours = 0;
        int dailyWage = 0;
        int workingDays = 0;
        int totalWage = 0;
        int maxWorkingDays = 20; // Assuming 20 working days per month
        int maxWorkingHours = 100; // Assuming 100 working hours per month
        int totalWorkingHours = 0;


        Random random = new Random();
        int employeeType = random.nextInt(2); // 0 for part-time, 1 for full-time


        while (workingDays < maxWorkingDays && totalWorkingHours < maxWorkingHours) {

            switch(employeeType) {
                case 0:
                    workHours = 8;
                    break;
                case 1:
                    workHours = 8;
                    break;
            }

            // Calculate the daily wage based on the number of hours worked
            dailyWage = workHours * wagePerHour;
            totalWage += dailyWage;
            workingDays++;
            totalWorkingHours += workHours;
        }

        System.out.println("Total wage for the month is: " + totalWage);
    }
}