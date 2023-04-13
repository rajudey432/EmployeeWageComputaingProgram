package EmployeeWage;

import java.util.Random;

public class CalculateForMultipleCompanies {
        public static void main(String[] args) {
            computeEmployeeWage("Company A", 20, 100, 22);
            computeEmployeeWage("Company B", 22, 120, 26);
        }

        public static void computeEmployeeWage(String companyName, int maxWorkingDays, int maxWorkingHours, int wagePerHour) {
            int workHours = 0;
            int dailyWage = 0;
            int workingDays = 0;
            int totalWorkingHours = 0;
            int totalWage = 0;
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

                dailyWage = workHours * wagePerHour;
                totalWage += dailyWage;
                workingDays++;
                totalWorkingHours += workHours;
            }

            System.out.println("Total wage for " + companyName + " is: " + totalWage);
        }
    }
