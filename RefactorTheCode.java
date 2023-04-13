package EmployeeWage;

import java.util.Random;

public class RefactorTheCode {
    private static final int WAGE_PER_HOUR = 20;
    private static final int MAX_WORKING_DAYS = 20; // Assuming 20 working days per month
    private static final int MAX_WORKING_HOURS = 100; // Assuming 100 working hours per month
    private static int totalWorkingHours = 0;
    private static int totalWage = 0;

    public static void main(String[] args) {
        computeEmployeeWage();
    }

    public static void computeEmployeeWage() {
        int workHours = 0;
        int dailyWage = 0;
        int workingDays = 0;
        Random random = new Random();
        int employeeType = random.nextInt(2);

        while (workingDays < MAX_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {
            switch(employeeType) {
                case 0:
                    workHours = 8;
                    break;
                case 1:
                    workHours = 8;
                    break;
            }

            dailyWage = workHours * WAGE_PER_HOUR;
            totalWage += dailyWage;
            workingDays++;
            totalWorkingHours += workHours;
        }

        System.out.println("Total wage for the month is: " + totalWage);
    }
}





