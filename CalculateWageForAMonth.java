package EmployeeWage;

import java.util.Random;

public class CalculateWageForAMonth {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int workHours = 0;
        int dailyWage = 0;
        int workingDays = 0;
        int totalWage = 0;
        int maxWorkingDays = 20; // Assuming 20 working days per month


        Random random = new Random();
        int employeeType = random.nextInt(2); // 0 for part-time, 1 for full-time

        
        while (workingDays < maxWorkingDays) {

            switch(employeeType) {
                case 0:
                    workHours = 8;
                    break;
                case 1:
                    workHours = 8;
                    break;
            }


            dailyWage = workHours * wagePerHour;
            totalWage += dailyWage;
            workingDays++;
        }

        System.out.println("Total wage for the month is: " + totalWage);
    }
}